package practice;

public class Math2 extends Math1{

	public static void main(String[] args) {
		Math2 m= new Math2();
		m.addition(25, 120);
		m.division(630, 15);
		m.substraction(100, 52);
		
		Math1.multiplication(15, 32);

	}
	public void division(int a, int b) {
		int div=a/b;
		System.out.println("the division is "+div);
	}

}
