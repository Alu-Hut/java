package Aufgabe30032022.kundendaten;
import Aufgabe30032022.Person;

public class Kunden extends Person{
	private int k_id;
	
	public Kunden(int k_id, String firstname, String lastname) {
		super (firstname, lastname);
		
		this.k_id = k_id;
	}
	
	public Kunden() {
		// TODO Auto-generated constructor stub
	}

	public int getK_id() {
		return this.k_id;
	}
	
	
	
}
