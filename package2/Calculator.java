package package2;

public class Calculator {
	
	public  double pi = 3.14159265359;
	public  double e = 2.71828182846;
	

	public static double add(double x, double y) {
		return x + y;
	}
	
	public static double minus(double x, double y) {
		return x - y;
	}
	
	public static double multiply(double x, double y) {
		return x * y;
	}
	
	public static double divide(double x, double y) {
		if (y == 0) {
			throw new IllegalArgumentException("Can't be divided by zero!");
		}
		
		return x / y;
	}
	
	public static double power(double x, double y) {
		return Math.pow(x, y);
	}
	
	public static double log(double x) {
		return Math.log10(x);
	}
	
	public static double ln(double x) {
		return Math.log(x);
	}
}
