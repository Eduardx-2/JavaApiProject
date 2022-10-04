/***
 * Este es un simple script en java para consumir apis, NO ES LA MEJOR FORMA, 
 * solo lo cree por aburrimiento y para ver más formas aparte de serializar. 
 * Me tarde 30 minutos creandolo y es una forma muy fácil de consumir una api en java.
 */



package Main;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.json.JSONObject;

public class dni_funcion {

	private static Scanner entradaOpciones;
	private static Scanner numDni;
	private static Scanner dni;

	public static void main(String[] args) {
		try {
			System.out.println("[1] - Oefa\t\t[2] - Reniec");
			entradaOpciones = new Scanner(System.in);
		    int opciones;
		    System.out.print("¿Que opción de consulta eliges? > ");
		    opciones = entradaOpciones.nextInt();
		    switch(opciones) {
		    case 1:
		    	try {
		    		numDni = new Scanner(System.in);
	                int dni;
	                System.out.print("Introduce el dni: ");
	                dni = numDni.nextInt();
	                // Vpn peruana
	                URL url = new URL("https://sistemas.oefa.gob.pe/sirte-backend/comun/combo/SSOfindPersonaPorDni/" + dni);
                    HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
                    conexion.setRequestMethod("GET");
                    conexion.setRequestProperty("User-Agent", "Mozilla/5.0");
                    conexion.setRequestProperty("Content-Type", "application/json");
                    conexion.connect();
                    int respuestaCode = conexion.getResponseCode();
                    if(respuestaCode == 200) {
                    	StringBuilder respuestaApi = new StringBuilder();
                        Scanner informacion = new Scanner(url.openStream());
                        while(informacion.hasNext()) {
                        	respuestaApi.append(informacion.nextLine());
                        }
                        informacion.close();
                        //   System.out.println(respuestaApi)
                        JSONObject jsonApi = new JSONObject(respuestaApi.toString());  
                        System.out.printf("\nNOMBRE: %s\nAPELLIDO PATERNO: %S\nAPELLIDO MATERNO: %s\nDIRECCION: %s\nCODIGO: %s\nESTADO CIVIL: %s", jsonApi.get("nombres"), jsonApi.get("apellidoPaterno"), jsonApi.get("apellidoMaterno"), jsonApi.get("direccion"), jsonApi.get("codigo"), jsonApi.get("estadoCivil"));
                    	break;
                    	
                    }else {
                    	System.out.println("Error en la api");
                    }
		    		
		    	}catch(Exception e) {
		    		System.out.println("Ocurrio un error en " + e);		
		    	}
		    case 2:
		    	try {
		    		dni = new Scanner(System.in);
                    int dniConsulta;
                    System.out.print("Introduce el dni: ");
                    dniConsulta = dni.nextInt();
                    // Esta api solo funciona con ip peruana, use vpn si en caso no eres Peruano
                    URL url = new URL("https://sigeun.unam.edu.pe/api/pide/reniec?dni=" + dniConsulta);
                    HttpURLConnection request = (HttpURLConnection) url.openConnection();
                    request.setRequestMethod("GET");
                    request.setRequestProperty("User-Agent", "Mozilla/5.0");
                    request.setRequestProperty("Content-Type", "application/json");
                    request.connect();
                    int codeResp = request.getResponseCode();
                    if(codeResp == 200) {
                    	StringBuilder apiResponse = new StringBuilder();
                        Scanner scann = new Scanner(url.openStream());
                        while(scann.hasNext()) {
                        	apiResponse.append(scann.nextLine());
                        }
                        scann.close();
                        //System.out.println(apiResponse);
                        JSONObject obj = new JSONObject(apiResponse.toString());
                        String nombre = obj.getJSONObject("data").getString("cReniecNombres");
                        String apellidoPa = obj.getJSONObject("data").getString("cReniecApel_pate");
                        String apellidoMa = obj.getJSONObject("data").getString("cReniecApel_mate");
                        String ubigueo = obj.getJSONObject("data").getString("cReniecUbigeo");
                        String direccion = obj.getJSONObject("data").getString("cReniecDireccion");
                        String estado = obj.getJSONObject("data").getString("cReniecEsta_civi");
                        String restriccion = obj.getJSONObject("data").getString("cReniecRestricciones");
                        
                        System.out.printf("\nNombre > %s\nAPELLIDO PATERNO > %s\nAPELLIDO MATERNO > %s\nCIUDAD > %s",nombre, apellidoPa, apellidoMa, ubigueo);
                        System.out.printf("\nDIRECCION > %s\nESTADO CIVIL > %s\nRESTRICCION > %s", direccion, estado, restriccion);
                        break;
                    }
		    		
		    	}catch(Exception e) {
		    		System.out.println("Ocurrio un error en " + e);
		    	}
		    default: 
		    	System.out.println("Opcion invalida");
		    	
		    }
		}catch(InputMismatchException e) {
			System.out.println("Error digite un valor númerico");
			
		}
		

	}

}
