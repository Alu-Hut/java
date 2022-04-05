package Tankstelle;

public class Treibstofflager extends Treibstoff{
	private int amount;
	//private static String fuelType;
	
	public Treibstofflager(String fuel, int preis, int amount) {
		super(fuel, preis);
		
		this.amount = amount;
		//this.fuelType = fuelType;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	/*public String getFuelType() {
		return fuelType;
	}
	
	public static void setFuelType(String fuelType) {
		Treibstofflager.fuelType = fuelType;
	}*/
}
