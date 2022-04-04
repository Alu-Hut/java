package Aufgabe30032022;
import Aufgabe30032022.kundendaten.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
//import Aufgabe30032022.kundendaten.Kunden;

public class Program {
	private String abtBez[];
	//private String abtBez2[];
	private String abt;
	private Mitarbeiter ma;
	private static Kunden ku;
	private Abteilung abtt;

	public static void main(String []args ) {
		//Program program = new Program();
		Person  person1 = new Person( "John" , "Doe");
		PersonAttribute  person2 = new PersonAttribute( "Jane" , "Doe", 35, 1.78);
		
		Kunden k1 = new Kunden(1, person1.getFirstname(), person1.getLastname());
		
		String abtBez[] = new String[10];
		String abtBez2[] = {"Development", "DevSec", "Network"};
		
		//System.out.println( person1.equals(person2)  );
		//System.out.println( person1.equals(program)  );
	
		System.out.println( person1 );
		System.out.println( person2.getFirstname() + " " + person2.getLastname() + ", alter: " + person2.getAlter() + ", groesse: " + person2.getKoerpergroesse());
		System.out.println(k1.getFirstname() + " " + k1.getLastname() + ", " + "Kundenummer: " + k1.getK_id());
		inputC(abtBez2);
		
	}
	
	public static void inputC(String abtBez2[]) {
		Scanner sc = new Scanner(System.in);
		//BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in)); 
		Boolean input2;
		String input = null;
		String inputKnum = null;
		
		//System.out.println("'q' für beenden / quit und 'N' weiter / continue!");
		
		/***
		 * Eingabe Kunden anlegen
		 */
		do {if(input == null || input.toLowerCase().equals("n")) {
			
				System.out.print("Bitte Vorname eingeben: ");
				String inputKname = sc.nextLine();
				System.out.println("Eingabe: " + inputKname);
				System.out.print("Bitte Nachname eingeben: ");
				String inputKnachname = sc.nextLine();
				System.out.println("Eingabe: " + inputKnachname);
				
				do {
					System.out.print("Bitte Kundenummer eingeben: ");
					input2 = sc.hasNextInt();
					if(input2 == false) {
					inputKnum = sc.nextLine();
					//break;
					//input2 = true;
					}
					//input2 = sc.hasNextInt();   //input2 = input2.readLine();
					System.out.println("Eingabe: " + input2);
					input2 = false;
				} 
				
				
				while(!input2);
					//inputKnum = sc.nextLine();
					//int tmp = Integer.parseInt(inputKnum);
					int mNum = 0;
					
					ku = new Kunden(Integer.parseInt(inputKnum), inputKname, inputKnachname);
					System.out.println("ausgabe Kunden ID: " + ku.getK_id());
					
					/***
					 * Mitarbeiter anlegen
					 */
					System.out.print("Bitte Vorname eingeben: ");
			
					String inputMname = sc.nextLine();
					System.out.println("Eingabe: " + inputMname);
					System.out.print("Bitte Nachname eingeben: ");
					String inputMnachname = sc.nextLine();
					System.out.println("Eingabe: " + inputMnachname);
					
					do {
						System.out.print("Bitte Mitarbeiternummer eingeben: ");
						input2 = sc.hasNextInt();
						if(input2 == false) {
						String inputMnum = sc.nextLine();
						//input2 = true;
						}
						//input2 = sc.hasNextInt();   //input2 = input2.readLine();
						System.out.println("Eingabe: " + input2);
					} 
					
					while(!input2);
						input = sc.nextLine();
					
					/***
					 * ende Kunden anlegen
					 */
					
					
					//System.out.println("Eingabe: " + input);
					
					//input = " ";
					
				/*System.out.println("Abteilung auswählen \n(Bitte eine der vorgeschlagenen Zahlen eingeben): ");
				for(int i = 0; i < abtBez2.length; i++) {
					System.out.println(i + " " + abtBez2[i]);
				}*/
				//System.out.print("Bitte Abteilung eingeben: " + abtBez2[0] + abtBez2[1] + abtBez2[2] );
					
					
				//input = sc.nextLine();
					
					/***
					 * Abteilung anlegen
					 */
					
				while(Integer.parseInt(input) > abtBez2.length) {
					System.out.println("Abteilung auswählen \n(Bitte eine der vorgeschlagenen Zahlen eingeben): ");
					for(int i = 0; i < abtBez2.length; i++) {
						System.out.println(i + " " + abtBez2[i]);
					}
					input = sc.nextLine();
				}
				System.out.println("Eingabe: " + abtBez2[Integer.parseInt(input)]);
				
				/***
				 * Abteilung anlegen beendet
				 */
				
				System.out.println("'q' für beenden / quit und 'N' weiter / continue!");
				input = sc.nextLine();
				
			}
			
		}while(!input.toLowerCase().equals("q"));
		
		sc.close();
	}
	
	
	
}
//
//int i = 800000;
//byte b = (byte) i;
//
//long l = i;
// 
//
//Person  person1 = new Person( "John" , "Doe");
//Object o = person1;
//Person px = (Person) o;

