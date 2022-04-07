package practice;

public class Constructor1 {
	int a;
	int b; 
	int c;
	
	public Constructor1(){
		 a= 30;
		 b=20;
		 c=25;
		System.out.println("constructor with zero parameter");
	}
	public Constructor1(int value1) {
		a=value1;
		System.out.println("constructor with one parameter is running");
	}
	public Constructor1(int value1, int value2) {
		a=value1;
		b=value2;
		System.out.println("constructor with two parameter is runnnig");
	}
	public Constructor1(int value1, int value2, int value3) {
		a=value1;
		b=value2;
		c=value3;
		System.out.println("constructor with three parameter is running ");
	}

	public static void main(String[] args) {
		Constructor1 c1= new Constructor1();
		c1.add();
		Constructor1 c2= new Constructor1(69);
		c2.subs();
		Constructor1 c3= new Constructor1(65, 54);
		c3.subs();
		Constructor1 c4= new Constructor1(123, 65, 45);
		c4.add();
		
	}
	public void add() {
		int d=a+b+c;
		System.out.println("the addition is "+d);
	}
	public void subs() {
		int sub=a-b-c;
		System.out.println("the substraction is "+sub);
	}

}
