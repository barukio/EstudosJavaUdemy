package util;

public class Conversor {

	public static double IOF = 0.06;
	
	public static double CurrencyConverter(double dp, double money) {
		return (dp * money) * IOF + dp * money;
	}
}
