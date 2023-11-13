
/*
 Write a program to take number of month and print the number of days in that month
Input: 4
Output: April is a 30 day's month
 */
class dailyFlash{
public static void main(String [] args){

	int choice=1;
	System.out.printf("Select your Choice:\n");
	System.out.printf("1:January\n");
	System.out.printf("2:February\n");
	System.out.printf("3:March\n");
	System.out.printf("4:April\n");
	System.out.printf("5:May\n");
	System.out.printf("6:June\n");
	System.out.printf("7:July\n");
	System.out.printf("8:August\n");
	System.out.printf("9:September\n");
	System.out.printf("10:Octobar\n");
	System.out.printf("11:November\n");
	System.out.printf("12:December\n");

	
	switch(choice){
	
		case 1:
			System.out.printf("January has 31 days\n");
			break;
		case 2:
			System.out.printf("February has 28/29 days\n");
			break;
		case 3:
			System.out.printf("March has 31 days\n");
			break;
		case 4:
			System.out.printf("April has 30 days\n");
			break;
		case 5:
			System.out.printf("May has 31 days\n");
			break;
		case 6:
			System.out.printf("June has 30 days\n");
			break;
		case 7:
			System.out.printf("July has 31 days\n");
			break;
		case 8:
			System.out.printf("August has 31 days\n");
			break;
		case 9:
			System.out.printf("September has 30 days\n");
			break;
		case 10:
			System.out.printf("October has 31 days\n");
			break;
		case 11:
			System.out.printf("November has 30 days\n");
			break;
		case 12:
			System.out.printf("December has 31 days\n");
			break;
		default:
			System.out.printf("Wrong Choice\n");
			break;
	}
}
}
