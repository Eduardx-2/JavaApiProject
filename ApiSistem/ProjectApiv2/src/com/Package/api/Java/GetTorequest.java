package com.Package.api.Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class GetTorequest {
	
	
	private static final String SEND_URL = "https://sigeun.unam.edu.pe/api/pide/reniec?dni=";
	private static String sendDni;
	private static String jsonResponse;

	public static void mainDni() throws Exception {
		BufferedReader leerDni = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("DNI [>>] ");
		sendDni = leerDni.readLine();
		requestApiTo();
	}
	
	public static void requestApiTo() {
		try {
			if(sendDni.length() == 8) {
				URL url = new URL(SEND_URL + sendDni);
                HttpURLConnection request = (HttpURLConnection) url.openConnection();
                request.setRequestMethod("GET");
                request.setRequestProperty("User-Agent", "Mozilla/5.0");
                request.setRequestProperty("Content-Type", "application/json");
                request.connect();
                int codeResp = request.getResponseCode();
                if(codeResp == 200) {
                	BufferedReader response = new BufferedReader(new InputStreamReader(url.openStream()));
                    String line;
                 
                    while ((line = response.readLine()) != null) {
                          jsonResponse = line;
                    //      System.out.println(jsonResponse);
                    }
                    response.close();
                    Gson gson = new Gson();
                    GetToPerson person = gson.fromJson(jsonResponse, GetToPerson.class);
                    System.out.println(person.toString());
                }else {
                	System.out.printf("OCURRIO UN ERROR [%d]", codeResp);
                }
            }else {
            	System.out.println("EL DNI INGRESADO NO ES VALIDO");
                System.exit(-1);
            }
			
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
