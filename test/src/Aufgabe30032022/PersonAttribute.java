package Aufgabe30032022;

public class PersonAttribute extends Person{
	private int alter;
	private double koerpergroesse;
	
	public PersonAttribute(String firstname, String lastname, int alter, double koerpergroesse) {
		super(firstname, lastname);
		
		this.alter = alter;
		this.koerpergroesse = koerpergroesse;
	}

	public int getAlter() {
		return this.alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public double getKoerpergroesse() {
		return this.koerpergroesse;
	}

	public void setKoerpergroesse(double koerpergroesse) {
		this.koerpergroesse = koerpergroesse;
	}
	
	public String getAttributes() {
		return this.getAlter() + " " + this.getKoerpergroesse();
	}
	
	public String toString() {
		return this.getAttributes();
	}
	
}
