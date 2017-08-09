package package1;

public class Teenagers extends People {
	
	public boolean isNaughty;

	public Teenagers(int age, char gender, boolean isMarried, String residence, double height, double weight, boolean isNaughty) {
		super(age, gender, isMarried, residence, height, weight);
		this.isNaughty = isNaughty;
		// TODO Auto-generated constructor stub
	}
	
	public String cangetPresent() {
		String result;
		if (this.isNaughty == true) {
			result = "You can't get the present!";
		} else {
			result = "You can get the present!";
		}
		return result;
	}
	
	public static void main(String [] args) {
		Teenagers Josh = new Teenagers(14, 'M', false, "Tuen Mun",1.65, 63.5, false);
		Teenagers Michael = new Teenagers(15, 'M', false, "Aberdeen", 1.68, 65.5, true);
		System.out.println(Josh.CalculateBMI());
		System.out.println(Josh.cangetPresent());
		System.out.println(Michael.CalculateBMI());
		System.out.println(Michael.cangetPresent());
	}

}
