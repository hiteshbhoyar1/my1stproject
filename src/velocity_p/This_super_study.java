package velocity_p;

public class This_super_study extends Super {
	int a=100;
	int b=90;

	public static void main(String[] args) {
		This_super_study ts= new This_super_study();
		ts.test();
	}
	
	public void test() {
		int a=20;
		int sum=25+a;
		int sum1=20+this.a;
		int sum2=this.a+a;
		int sum3=this.a+this.b;
		int sum4=this.b+a;
		int sum5=super.a+this.b;
		int sum6=super.b+this.a;
		int sum7=super.a+super.b+this.a+this.b+a;
		//super values a=300 b=250 calling global variable of super class by using super keyword
		System.out.println("the addition is "+sum);
		System.out.println("the addition is "+sum1);
		System.out.println("the addition is "+sum2);
		System.out.println("the addition is "+sum3);
		System.out.println("the addition is "+sum4);
		System.out.println("the addition is "+sum5);
		System.out.println("the addition is "+sum6);
		System.out.println("the addition is "+sum7);
	}

}
