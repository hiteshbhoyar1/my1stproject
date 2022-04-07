package practice;

public class Switch_Stdy {

	public static void main(String[] args) {
		// seven days of week given by numbers
		
		int num=5;
		switch (num) {
		case 1:System.out.println("the first day of the week is monday");
	    break;
		case 2:System.out.println("the second day of the week is tuesday");
		break;
		case 3:System.out.println("the third day of the week is wednesday");
		break;
		case 4:System.out.println("the fourth day of the week is thursday");
		break;
		case 5:System.out.println("the fifth day of the week is friday");
		break;
		case 6:System.out.println("the sixth day of the week is saturday");
		break;
		case 7:System.out.println("the seventh day of the week is sunday");

		default:System.out.println("please put valid input");
			break;
		}

	}

}
