package de.atiw.sportfest.atiw_sportfest.xml;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;


import org.w3c.dom.Document; 

public class XML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Document doc = null; 
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("TOMCAT Installation");
		System.out.println("Was soll bearbeitet werden?");
		System.out.println("2) Context");
		System.out.println("1) Users");
		System.out.println("0) Beenden");
		int eingabe = 0;
		try {

			 
			do {
				System.out.println("Was soll bearbeitet werden?");
				System.out.println("2) Context");
				System.out.println("1) Users");
				System.out.println("0) Beenden");
				eingabe = Integer.parseInt(br.readLine());
				switch (eingabe) {
				case 0:
					break;
				case 1:
					File f = new File("S:\\Steffen-Baehr\\Sportfest\\j\\atiw-sportfest\\out\\tomcat-users.xml");
					System.out.println("Bitte einen Usernamen eingeben");
					String user = br.readLine();
					System.out.println("Bitte einen Passwort eingeben");
					String pwd = br.readLine();
					
					
					break;
				case 2:
					f = new File("S:\\Steffen-Baehr\\Sportfest\\j\\atiw-sportfest\\out\\context.xml");
					System.out.println("Bitte einen Usernamen für die Datenbank eingeben");
					String userDB = br.readLine();
					System.out.println("Bitte das Passwort eingeben");
					String pwdDB = br.readLine();
					System.out.println("Bitte die IP-Adresse der Datenbank angeben");
					String IPDB = br.readLine();
					System.out.println("Bitte den Port der Datenbank angeben");
					String portDB = br.readLine();
					
					
					break;
				default:
					System.out.println("Falsche Eingabe! Bitte erneut versuchen!");

				}

			} while (eingabe != 0);
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
