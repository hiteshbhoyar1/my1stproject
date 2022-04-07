package velocity_p;

public class Lcm_h {

	public static void main(String[] args ) {
		int a= 21;
		int b= 42;
		int hcf= 0;
		
	
		for(int i=1; i<=a; i++) {
			if(a%i==0 & b%i==0) {
				hcf=i;
			}
			
		}
		int lcm =a*b/hcf;
		System.out.println("the hcf of the number is  "+hcf);
		System.out.println("the lcm of the numbers is " +lcm);
		

	}

}
