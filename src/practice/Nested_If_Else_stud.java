package practice;

public class Nested_If_Else_stud {

	public static void main(String[] args) {
		String username="Hitesh1";
		String password="Hitesh@2033";
		int acc= 12569863;
		float transfer=6000.23f;
		if(username=="Hitesh1") {
			System.out.println("please enter the password");
			if(password=="Hitesh@2033") {
				System.out.println("login successful");
				if(acc==12569863) {
					System.out.println("account has been recognised");
					if(transfer==6000.145f) {
						System.out.println("transfer successful");
					}
					else {
						System.out.println("insufficient fund");
					}
				}
				else {System.out.println("account mismatch");	}
		}
			else {
				System.out.println("wrong password try again");}
			}
		else {
			System.out.println("invalid username");}
}
}