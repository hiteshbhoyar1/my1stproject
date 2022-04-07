package creative;

public class Armstrong_number {

	public static void main(String[] args) {
		int no= 153;
		int t1= no;
		int arm=0;
		int rem;
		while(t1!=0) {
			int mul=1;
			rem=t1%10;
			mul=rem*rem*rem;
			 arm= arm+mul;
			 t1= t1/10;	
			
		} System.out.println(arm);
		if(arm==no) {
			System.out.println("the is armstrong number");
		}
		else {
			System.out.println("the number is not armstrong number");
		}
	

	}

}
