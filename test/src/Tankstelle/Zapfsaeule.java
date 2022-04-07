package Tankstelle;


/**
 * 
 * @startuml
 * Zapfsaeule -> Lager : zapfen
 * Lager --> Zapfsaeule : zapfen
 * @enduml
 *
 */

public class Zapfsaeule extends Treibstofflager{
	
	private String treibstoffArt;
	private int amountZ;
	
	public Zapfsaeule(String fuel, int preis, int amount) {
		super(fuel, preis, amount);
		
		
	}
	
	public String getTreibstoffArt() {
		return treibstoffArt;
	}
	
	public void setTreibstoffArt(String treibstoffArt) {
		this.treibstoffArt = treibstoffArt;
	}
	
	

}
