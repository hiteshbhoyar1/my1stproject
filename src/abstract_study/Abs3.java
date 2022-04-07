package abstract_study;

public class Abs3 extends Abs2 {

	public static void main(String[] args) {
		Abs3 ab= new Abs3();
		ab.add(25, 10, 120);
		ab.sub(42, 13, 14);
		ab.mul(14, 42);

	}

	
	public void mul(int num1, int num2) {
		super.a=num1;
		super.b=num2;
		super.mul=super.a*super.b;
		System.out.println("the multiplication is "+mul);
		
	}

}
