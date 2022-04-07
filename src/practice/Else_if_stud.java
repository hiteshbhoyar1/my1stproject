package practice;

public class Else_if_stud {
	String event;
	String venue;
	int players;
	float distance;
	String medal;
	public static void main(String[] args) {
		Else_if_stud e1= new Else_if_stud();
		e1.match();
		
		Else_if_stud e2= new Else_if_stud();
		e2.comp("Throw ball","Tokiyo",10,79.98f,"Silver");
	}
	public void match() {
		// if player throws the ball
		// more than 80 m then he gets the gold medal
		// less than 80m more than 78 then he gets the silver 
		// less than 78m more than 76m then he gets the bronze
		float distance=79.98f;
		if(distance>80) {
			System.out.println("the player will get the gold medal");
		} 
		else if(distance>78 & distance<80) {
			System.out.println("the player will get the silver medal");
		}
		else if(distance>76 & distance<78) {
			System.out.println("the player will get the bronze medal");
		}
		else
		{
			System.out.println("the player will not get the medal");
		}
	}
	public void comp(String nam1, String nam2, int nam3, float nam4, String nam5) {
		event=nam1;
		venue=nam2;
		players=nam3;
		distance=nam4;
		medal=nam5;
		System.out.println("the event name is "+event);
		System.out.println("the venue is "+venue);
		System.out.println("the number of player is "+players);
		System.out.println("the distance covered by the ball "+distance);
		System.out.println("the medal got by the player "+medal);
	}
}
