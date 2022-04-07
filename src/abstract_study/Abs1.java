package abstract_study;

public abstract class Abs1 {
	int a=20;
	int b=25;
	int c=15;
	int sum;
	int sub;
	
	public void add(int num1, int num2, int num3) {
		a=num1;
		b=num2;
		c=num3;
		int a=10;
		int sum=this.a+this.b+this.c+20+a;
		System.out.println("the addition is "+sum);
		
	}
	public abstract void sub(int num1, int num2, int num3);
	
	
	
	
	
}
