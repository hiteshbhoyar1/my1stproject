package practice;

public class Constructor {
	float a;
	float b; 
	float c;  // declaration of the variables 
	
	public Constructor() {
	  a= 125.23f;
	  b= 130.236f;
	  c= 120.32588f;
	 System.out.println("constructor with zero parameter ");
	}
	
	public Constructor(float num1) {
		a=num1;
		System.out.println("constructor with one parameter");
	}
	
	public Constructor(float num1, float num2) {
		a=num1;
		b=num2;
		System.out.println("constructor with two parameter");
	}
	
	public Constructor(float num1, float num2,float num3) {
		a=num1;
		b=num2;
		c=num3;
		System.out.println("constructor with three parameter");
	}

	public static void main(String[] args) {
		Constructor c1= new Constructor();  // obj for zero parameter
		c1.addition();
		Constructor c2= new Constructor(123.026f);
		c2.addition();
		Constructor c3= new Constructor(1245.236f,1248.25f);
		c3.addition();
		Constructor c4= new Constructor(125.36985f,1247.23f,1245.25584f);
		c4.addition();
		Constructor c5= new Constructor(96589.25699f,23658.236584f);
		c5.substraction();
		

	}
	
	public void addition() {
		float sum= a+b+c;
		System.out.println("the addition is "+sum);
		
	}
	public void substraction() {
		float sub= a-b-c;
		System.out.println("the substraction is "+sub);
	}

}
