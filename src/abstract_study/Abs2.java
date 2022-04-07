package abstract_study;

public abstract class Abs2 extends Abs1 {
	int a=10;
	int b=9;
	int c=8;
	int mul;
	
	public void sub(int num1, int num2, int num3) {
		super.a=num1;
		super.b=num2;
		super.c=num3;
		super.sub=super.a-super.b-super.c;
		System.out.println("the substraction is "+sub);
		
	}
	public abstract void mul(int num1, int num2);
	

}
