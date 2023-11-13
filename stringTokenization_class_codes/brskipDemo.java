/*Take input from user 
  jersy number(int), grade(char), Name(String), average(Double)
  br.skip() method is used here*/

import java.io.*;
class brSkipDemo{

	public static void main(String [] args) throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Jersy Number:");	
		int jersy_num=Integer.parseInt(br.readLine());
		
		System.out.println("Enter Grade:");	
		char grade= (char)br.read(); //typecast into char
			
		br.skip(1); //skip one character i.e. "\n"

		System.out.println("Enter Name:");	
		String Name= br.readLine();

		System.out.println("Enter Average:");	
		double avg=Double.parseDouble(br.readLine());
		
		System.out.println("Jersy number="+jersy_num);
		System.out.println("Grade="+grade);
		System.out.println("Name="+Name);		
		System.out.println("Average="+avg);
	
		
	}
}/*Output: 
	Jersy number=007
	Grade=A
	Name=Vaibhav 
	Average=58.182
*/
