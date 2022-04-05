package Tankstelle;

public class Treibstoff {
	private static String fuel;
	private int preis;
	
	public Treibstoff (String fuel, int preis) {
		
	}

	public static String getFuel() {
		return fuel;
	}

	public static void setFuel(String fuel) {
		Treibstoff.fuel = fuel;
	}

	public int getPreis() {
		return preis;
	}

	public void setPreis(int preis) {
		this.preis = preis;
	}
	
}
