package com.Package.api.Java;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	protected static Scanner introOptions = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		while (true) {
			menuRequest();
		}    
	}
 
	static final void menuRequest() {
		System.out.println("1 - CONSULTA DNI SINADEF"
				+ "\n2 - CONSULTA DNI RENIEC");
		System.out.print("[ENTER OPTIONS] >> ");
		int optionsConsulta = introOptions.nextInt();
		
		switch (optionsConsulta) {
		case 1: try {
				GetTsetRequest.inputOneLine();
				break;
			} catch (IOException e) {
				System.out.println(e);
			}
		    
		case 2: try {
				GetTorequest.mainDni();
			} catch (Exception e) {
				System.out.println(e);
			}
		default:
			System.out.println("OPCION INVALIDA");
			System.exit(-1);
		}
	}
}
