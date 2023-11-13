
/*
 Write a program to take marks of 5 subjects P,C,M,B,CS.
 calculate percentage and grade according to the following:
 Percentage>=90% : Grade A
 Percentage>=80% : Grade B
 Percentage>=70% : Grade C
 Percentage>=60% : Grade D
 Percentage>=40% : Grade E
 Percentage<=40% : Grade F
 */
import java.io.*;
class dailyFlash{
public static void main(String [] args) throws IOException{

	InputStreamReader isr= new InputStreamReader(System.in);

	BufferedReader br= new BufferedReader(isr);

	System.out.printf("Enter Physics Marks\n");
	int Phy=Integer.parseInt(br.readLine());
	
	System.out.printf("Enter Chemistry Marks\n");
	int Chem=Integer.parseInt(br.readLine());
	
	System.out.printf("Enter Maths Marks\n");
	int Maths=Integer.parseInt(br.readLine());
	
	System.out.printf("Enter Biology Marks\n");
	int Bio=Integer.parseInt(br.readLine());
	
	System.out.printf("Enter Computer Science Marks\n");
	int CS=Integer.parseInt(br.readLine());
	
	int percentage=(Phy+Chem+Maths+Bio+CS)/5;

	if(percentage>=90)
		System.out.printf("Percentage=%d: Grade A",percentage);
	
	else if(percentage>=80)
		System.out.printf("Percenage=%d: Grade B",percentage);

	else if(percentage>=70)
		System.out.printf("Percenage=%d: Grade C",percentage);
		
	else if(percentage>=60)
		System.out.printf("Percentage=%d: Grade D",percentage);
	
	else if(percentage>=40)
		System.out.printf("Percentage=%d: Grade E",percentage);
	
	else if(percentage<=40)
		System.out.printf("Percentage=%d: Grade F",percentage);
}
}
