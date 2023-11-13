
/*
 Write a program to take integer ranging between 0 to 6 and print corresponding weekday
 Input: 2
 Output: Wednesday
*/
class dailyFlash{
public static void main(String [] args){

	int choice=0;
	System.out.printf("Select your choice between 0 to 6:\n");

	switch(choice){
	
		case 0:
			System.out.printf("Monday\n");
			break;
		case 1:
			System.out.printf("Tuesday\n");
			break;
		case 2:
			System.out.printf("Wednesday\n");
			break;
		case 3:
			System.out.printf("Thursday\n");
			break;
		case 4:
			System.out.printf("Friday\n");
			break;
		case 5:
			System.out.printf("Saturday\n");
			break;
		case 6:
			System.out.printf("Sunday\n");
			break;
		default:
			System.out.printf("Wrong choice\n");
			break;
	}
}
}
