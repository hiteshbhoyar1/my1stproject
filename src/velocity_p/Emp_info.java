package velocity_p;

public class Emp_info {
	// player name ---> String
	// country to represent---> string
	// standing position----> int
	// contract grade----> char
	// annual income---> float
	
	
	String Ply_name;
	String country;
	int position;
	char grade;
	float income;
	
	public void employee_info() {
		System.out.println("====================================");
		System.out.println("the player name is "+Ply_name);
		System.out.println("the country which he represent "+country);
		System.out.println("the position of the player is "+position);
		System.out.println("the annual contract of the player is "+income);
	}
	
}
