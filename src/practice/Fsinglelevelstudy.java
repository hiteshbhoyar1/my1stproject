package practice;

public class Fsinglelevelstudy {

	public static void main(String[] args) {
		Fson s= new Fson();
		s.bike();
		s.height();
		s.wealth();
		
		Fson.skin();// calling static method from Fson class
		Fson.house();//using subclass name calling static method from super class

	}

}
