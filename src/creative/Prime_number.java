package creative;

public class Prime_number {

	public static void main(String[] args) {
		int no= 11;
		int temp=0;
		for(int i=2; i<=no-1; i++) {
			if(no%i==0) {
				temp=temp+1;
			}
			
		}System.out.println(temp);
		
		if(temp==0) {
			System.out.println(no+" is prime number");
		}
		else {
			System.out.println(no+" is not a prime number");
		}


	}

}
