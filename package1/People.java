package package1;

public class People {
	
	public double[] a;
	public int age;
	public char gender;
	public boolean isMarried;
	public String residence;
	public double height;
	public double weight;
	
	public People(int age, char gender, boolean isMarried, String residence, double height, double weight) {
		this.age = age;
		this.gender = gender;
		this.isMarried = isMarried;
		this.residence = residence;
		this.height = height;
		this.weight = weight;
	}
	
	/*public double[] compute() {
		for (int i = 0; i < 10; i++) {
			a[i] = this.height * Math.pow(2, i);
			
		}
		return a;
	}*/
	
	public double CalculateBMI() {
		double result = weight / (height * height);
		return result;
	}
	
	
	
	public static void main(String[] args) {
		People David = new People(34, 'M', false, "Toronto", 1.76, 65.8);
		People Lisa = new People(65, 'F', true, "Hong Kong", 1.58, 60.0);
		System.out.println(David.CalculateBMI());
		System.out.println(Lisa.CalculateBMI());
	}
}
