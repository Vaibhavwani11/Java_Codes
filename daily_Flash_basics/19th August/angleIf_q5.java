
/*
 Write a program that takes angles of a triangle from user and print whether the triangle is valid or not 
 (Note: Addition of angles of triangle has to be 180 in order to consider it as valid one)
Input: 30 60 70
Output: The triangle with angles 30,60 & 70 is not valid 
 */
class dailyFlash{
public static void main(String[] args){

	int angle1=30,angle2=40,angle3=70;

	int Add= angle1 + angle2 + angle3;

	if(Add==180){
	
		System.out.printf("The triangle with angles %d,%d & %d is valid\n",angle1,angle2,angle3);
	}
	else{
	
		System.out.printf("The triangle with angles %d,%d & %d is not valid\n",angle1,angle2,angle3);
	}
}
}
