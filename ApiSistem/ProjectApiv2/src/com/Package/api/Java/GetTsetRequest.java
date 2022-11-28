package com.Package.api.Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class GetTsetRequest {
	
	private static final String URL_SENDING = "https://sistemas.oefa.gob.pe/sirte-backend/comun/combo/SSOfindPersonaPorDni/";
	
	private static String jsonN;
	private static BufferedReader inputDni;
	private static String nDni;
	
	public static void inputOneLine() throws IOException {
		inputDni = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduzca el dni: ");
	    nDni = inputDni.readLine();
	    requestTo();
	}
	
	
	public static void requestTo() {
		try {
	        if(nDni.length() == 8) {
	        	URL url = new URL(URL_SENDING + nDni);
	        //	System.out.println(url);
	        	HttpURLConnection responseR = (HttpURLConnection)url.openConnection();
	        	responseR.setRequestMethod("GET");
	        	responseR.setRequestProperty("User-Agent", "Mozilla/5.0");
	        	responseR.setRequestProperty("Content-Type", "application/json");
	        	responseR.connect();
	        	int responseCode = responseR.getResponseCode();
	        	if(responseCode == 200) {
	        		BufferedReader whileLine = new BufferedReader(new InputStreamReader(url.openStream()));
	                String jsonInLine;
	                while ((jsonInLine = whileLine.readLine()) != null) {
	                      jsonN = jsonInLine;
	                }      
	        		whileLine.close();
	        		gsonParsing(jsonN);
	        	}else {
	        		System.out.println("OCURRIO UN ERROR CON EL SERVIDOR");
	        	}
	        }else {
	        	System.out.println("DNI INVALIDO");
	        	System.exit(-1);
	        }
	        
		}catch (Exception e) {
			System.out.println(e);
		}
			
	}

	static void gsonParsing(String dataJson) {
	 	Gson gson = new Gson();
		GsonClass sysJson = gson.fromJson(dataJson, GsonClass.class);
		System.out.println(sysJson);
	}
}
