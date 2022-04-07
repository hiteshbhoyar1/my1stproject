package creative;

public class Star {

	public static void main(String[] args) {
		Star s= new Star();
		
		s.t1();
		s.t2();

	}
	public void t1() {
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void t2() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
