package creative;

public class Lcm_hcf {

	public static void main(String[] args) {
		
			int a= 12;
			int b= 14;
			int hcf=0;
			
			for(int i=1; i<=a; i++) {
				
				if(a%i==0 & b%i==0) {
					hcf=i;
				}
			}
			int lcm= a*b/hcf;
			System.out.println("the hcf of two numbers is "+hcf);
			System.out.println("the lcm of two numbers is "+lcm);
		}

	}


