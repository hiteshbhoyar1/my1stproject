package practice;

public class Nested_If_Else_Study {
	// UserName
	// Password
	// captcha
	// otp

	public static void main(String[] args) {
		String Username= "Arvind@01";
		String Password= "Arvind@16";
		int captcha= 545556;
		int otp= 102102;
		if(Username=="Arvind@01") {
			System.out.println("username is correct please enter your password");
			
			if(Password=="Arvind@16") {
				System.out.println("the password is correct please enter the captcha");
				
				if(captcha==545556) {
					System.out.println("please enter the otp received on your device");
					
    				if(otp==102102) {
						System.out.println("login success");
					}
					else {
						System.out.println("please enter valid otp");
					}
				}
				else {
					System.out.println("please enter valid captcha");
				}
			}
			else {
				System.out.println("please enter valid password");
			}
		}
		else {
			System.out.println("please enter valid username");
		}
		
	}

}
