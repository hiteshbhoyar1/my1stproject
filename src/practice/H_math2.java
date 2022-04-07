package practice;

public class H_math2 extends H_math {

	public static void main(String[] args) {
		H_math1 m= new H_math1();
		m.division(960, 12);
		m.multiplication(45, 41);
		H_math1.addition(125, 120);
		
		H_math2 m1= new H_math2();
		m1.multiplication(12, 50);
		m1.substraction(651, 140);
	    percentage(77, 81, 78);
		

	}
	public void substraction(int a, int b) {
		int sub=a-b;
		System.out.println("the subs is "+sub);
	}
	public static void percentage(float a, float b, float c) {
		float per=(a+b+c)/3;
				System.out.println("the per is "+per);
	}

}
