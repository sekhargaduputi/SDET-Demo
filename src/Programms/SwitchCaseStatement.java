package Programms;

public class SwitchCaseStatement {
	
	public static void main(String args[]){
		
		int day=0;
		
		switch(day){
		
		case 1:System.out.println("sunday");
				break;
		case 2:System.out.println("Monday");
				break;
		case 3: System.out.println("Tusday");
				break;
		case 4:System.out.println("Wensday");
				break;
		case 5:System.out.println("Thursday");
				break;
		case 6:System.out.println("Friday");
				break;
		case 7:System.out.println("Saturday");
			break;
		default:System.out.println("Invalid Week NUmber");
		}
	}

}
