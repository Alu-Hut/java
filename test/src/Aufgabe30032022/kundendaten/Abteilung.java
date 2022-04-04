package Aufgabe30032022.kundendaten;

public class Abteilung {
	private String abtBez;
	private String abtLeit;
	private Mitarbeiter mitAr;
	
	public Abteilung(String abtBez, String abtLeit) {
		this.abtBez = abtBez;
		this.abtLeit = abtLeit;
		this.mitAr = mitAr;
	}

	public String getAbtBez() {
		return abtBez;
	}

	public void setAbtBez(String abtBez) {
		this.abtBez = abtBez;
	}

	public String getAbtLeit() {
		return abtLeit;
	}

	public void setAbtLeit(String abtLeit) {
		this.abtLeit = abtLeit;
	}

	public Mitarbeiter getMitAr() {
		return mitAr;
	}

	public void setMitAr(Mitarbeiter mitAr) {
		this.mitAr = mitAr;
	}
	
	
	
}
