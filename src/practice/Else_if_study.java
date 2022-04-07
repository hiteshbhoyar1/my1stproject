package practice;

public class Else_if_study {
	String car_comp;
	float avg;
	int capa;
	char grade;
	
	
	

	public static void main(String[] args) {
		Else_if_study e= new Else_if_study();
		e.test();
		Else_if_study e1=new Else_if_study();
		e1.car_info("Creta", 20.66f, 5, 'A');
		
		
		

	}
	public void test() {
		// if the average of the car is 
		// equal to 15 then its not a good car to buy
		// more than 15 but less than 18 then its a good to buy
		// more than 18 then its best choice for customer 
		
		float avg=20.66f;
		if(avg==15) {
			System.out.println("Its not a good car to buy");
		}
		else if(avg>15 & avg<18) {
			System.out.println("its a good to buy the car");
		}
		else if(avg>18 & avg<22) {
			System.out.println("its a better to buy the car than the other ");
		}
		else if(avg>23) {
			System.out.println("its a best to buy the car ");
		}
		
		}
	
	public void car_info(String car_com, float avG, int num, char Grade) {
		car_comp= car_com;
		avg= avG;
		capa= num;
		grade= Grade;
		
		System.out.println("========================================");
		System.out.println("the name of the car company is "+car_comp);
		System.out.println("the average of the car is "+avg);
		System.out.println("the seating capacity of the car is "+capa);
		System.out.println("the grade given to the car for safety is "+grade);
	}
	

}
