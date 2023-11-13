/* Write a program where in main() method create 2 objetcts of BufferedReader class as br1 &br2,
 Take your name as input from br1 object and surname from br2 object and print them.
 (Do not forget to close after using br1 and br2)
Input:  Name:Vaibhav
	Surname:Wani

Output: Vaibhav Wani
 */
import java.io.*;
class flash{

	public static void main(String [] args) throws IOException{
			
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name and Surname:");	
		String name=br1.readLine();
		String surname=br2.readLine();

		System.out.println(name+" "+surname);
		
		br1.close();
		
		br2.readLine();	//will give error bcoz both conections are closed now
	        //because System.in gets null after br.close()
		
	}
}
