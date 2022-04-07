package velocity_p;

public class Lcm_hcf1 {

	public static void main(String[] args) {
		
				int a=12;
				int b=32;
				int hcf=0;
				
				for(int i=1; i<=a; i++) {
					if(a%i==0 & b%i==0) {
						hcf=i;
					}
				}
				int lcm=a*b/hcf;
				System.out.println("the hcf of two number is "+hcf);
				System.out.println("the lcm of two number is "+lcm);
		}
		}


