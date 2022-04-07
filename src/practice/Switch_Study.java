package practice;

public class Switch_Study {

	public static void main(String[] args) {
		//i am born in month may
		// 12 months  are given of the year
		
		String month= "May";
		switch (month) {
		case "Jan":System.out.println("this is first month of the year ");
		break;
		case "Feb":System.out.println("this is second month of the year");
		break;
		case "March": System.out.println("this is third month of the year");
		break;
		case "April": System.out.println("this is fourth month of the year ");
		break;
		case "May":System.out.println("this is fifth month of the year ");
		break;
		case "June": System.out.println("this is sixth month of the year ");
		break;
		case "July":System.out.println("this is seventh month of the year ");
		break;
		case "Aug":System.out.println("this is eight month of the year");
		break;
		case "Sept":System.out.println("this is ninth month of the year");
		break; 
		case "Oct":System.out.println(" this is tenth month of the year");
		break;
		case "Nov":System.out.println("this is eleventh month of the year");
		break;
		case "Dec":System.out.println("this is twelfth month of the year");
		break;
		

		default:System.out.println("invalid input, please put the number between jan-dec");
			break;
		}
		}

	}


