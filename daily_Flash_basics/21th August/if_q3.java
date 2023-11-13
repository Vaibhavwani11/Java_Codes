/*
 Ask user to enter age,sex(M/F),marrital status(Y/N) and then using following rules print thier place of survive 
 If employee is female rhen she will work only in urban areas
 If employee is a male and age is in between 20 to 40 then he may work i anywhere
 If employee is a male and age is in between 40 to 60 then he will work only in urban areas
 Any other input of age should print "ERROR"
 */
import java.io.*;
class dailyFlash{

	public static void main(String [] args) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br= new BufferedReader(isr);
		
		System.out.println("Enter age:");
		int age= Integer.parseInt(br.readLine());
		System.out.println("Enter gender(M/F):");
		char gen=(char)br.read();
		System.out.println("Enter Marittal status(Y/N):");
		char marry=(char)br.read();
				

		if(gen=='F'){
		
			System.out.println("Work only in urban areas");
		}
		else if(gen=='M'){
		
			if(age<=40&& age>=20)
				System.out.println("Work anywhere");

			else if(age>40 && age<=60)
				System.out.println("Work only in urban areas");
		}
		else{
		
			System.out.println("ERROR");
		}
	}
}
