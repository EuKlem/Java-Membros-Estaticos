package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double calculator(double precoDolar, double comprarDolar) {
		return (comprarDolar * precoDolar) * (1 + IOF);
				
	}
}
