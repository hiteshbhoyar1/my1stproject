package practice;

public class Switch_std {

	public static void main(String[] args) {
		Switch_std sw= new Switch_std();
		
		char choice='D';
		switch (choice) {
		case 'A':
			sw.test1(20);
		break;
		case 'B':
			sw.test2(45);
		break;
		case 'C':
			sw.test3(62);
		break;
		case 'D':
			sw.test4(75);
		break;

		default:System.out.println("invalid input");
			break;
		}

	}
	public void test1(int a) {
		int div=a%2;
		if(div==0) {
			System.out.println("the given number is divisible by 2");}
		else 
		{System.out.println("the given number is not divisible by 2");
		}
		}
	public void test2(int b) {
		int div=b%3;
		if(div==0) {System.out.println("the given no. is divisible by 3");}
		else {System.out.println("the given no. is not divisible by 3");}	
}
	public void test3(int c) {
		int div=c%4;
		if(div==0) {System.out.println("the given no. is divisible by 4");}
		else
		{System.out.println("the no. is not divisible by 4");}
		}
		public void test4(int d) {
		int div=d%5;
		if(div==0) {System.out.println("the given no. is divisible by 5");}
		else {System.out.println("the given no. is not divisible by 5");	}
		}
		}