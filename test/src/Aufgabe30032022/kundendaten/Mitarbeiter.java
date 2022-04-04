package Aufgabe30032022.kundendaten;
import Aufgabe30032022.*;

public class Mitarbeiter extends Person{
	private Integer  ma_id;
	private String abtBez;
	private String status;
	private Boolean isAbtLeit;
	
	
	public Mitarbeiter(String firstname, String lastname, Integer ma_id) {
		super(firstname, lastname);
		this.ma_id = ma_id;
	}
	
	public Mitarbeiter(String status, String firstname, String lastname, String abtBez, Boolean isAbtLeit) {
		super(firstname, lastname);
		this.abtBez = abtBez;
		this.status = status;
		this.isAbtLeit = isAbtLeit;
	}

	public Integer getMa_id() {
		return ma_id;
	}

	public void setMa_id(Integer ma_id) {
		this.ma_id = ma_id;
	}

	public String getAbtBez() {
		return abtBez;
	}

	public void setAbtBez(String abtBez) {
		this.abtBez = abtBez;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getIsAbtLeit() {
		return isAbtLeit;
	}

	public void setIsAbtLeit(Boolean isAbtLeit) {
		this.isAbtLeit = isAbtLeit;
	}
	
	

}
