package practice;

public class Father1 {
	public int a;
		   int b;
    protected int c;
    private int d;
    public static void main(String[] args) {
		Father1 f= new Father1();
		f.addition(12, 40, 40);
		f.add(41, 70);
		f.multiplication(54, 17);
		f.substraction(521, 411);
	}
    public void addition(int num1, int num2, int num3) {
    	a=num1;
    	b=num2;
    	c=num3;
    	int sum=a+b;
    	System.out.println("the addition of public is "+sum);
    }
    void substraction(int num1, int num2) {
    	a=num1;
    	b=num2;
    	int sub=a-b;
    	System.out.println("the substraction of default is "+sub);
    }
    protected void multiplication(int num1, int num2) {
    	a=num1;
    	b=num2;
    	int mul=a*b;
    	System.out.println("the multiplication of protected is "+mul);
    }
    private void add(int num1, int num2) {
    	d=num1;
    	a=num2;
    	int sum=d+a;
    	System.out.println("the addition is "+sum);
    	
    }

}
