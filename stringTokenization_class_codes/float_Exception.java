/*Take input from user
jersy number(int), grade(char), Name(String), average(Double)*/

import java.io.*;
class inpDemo{

	public static void main(String [] args) throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Jersy Number:");	
		int jersy_num=Integer.parseInt(br.readLine());
		
		System.out.println("Enter Grade:");	
		char grade= (char)br.read(); //typecast into char
		
		System.out.println("Enter Name:");	
		String Name= br.readLine();
		
		//br.read accepts only one character but we are giving "a\n" i.e. two characters
		//So,'a' is accepted by br.read
		//and '\n' is accepted by br.readLine()	
		
		System.out.printf("Enter Average:");	
		float avg= Float.parseFloat(br.readLine());
		
		System.out.println("Jersy number="+jersy_num);
		System.out.println("Grade="+grade);
		System.out.println("Name="+Name);		
		System.out.println("Average="+avg);

	}
}
/*Output: 
	Jersy number=007
	Grade=A
	Name=
	Average=58.182
*/
