/* Write a program in java for class IPL that contains:
1. Team name
2. Captain name
3. Best win percentage
4. Number of Indian batsmen
5. Number of International batsmen
Take input forabove fields using BufferedReader class and display them as follows:
Input:
	CSK
	Mahendra Singh Dhoni
	61.28
	6
	3
Ouput:
	The IPL team name is: CSK
	It’s captain is: Mahendra Singh Dhoni
	It has the best win percentage of: 61.28
	Number of Indian batsmen are: 6
	Number of International batsmen are: 3*/
import java.io.*;
class IPL{

	public static void main(String []args) throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);

		BufferedReader br= new BufferedReader(isr);
		
		System.out.println("Enter the Team name:");
		String Team_name= br.readLine();
		
		System.out.println("Enter the Captain name:");
		String cap_name= br.readLine();
		
		System.out.println("Enter win percentage:");
		float per= Float.parseFloat(br.readLine());
		
		System.out.println("Enter number of Indian batsmen:");
		int Ind= Integer.parseInt(br.readLine());
		
		System.out.println("Enter Number of international batsmen:");
		int abr= Integer.parseInt(br.readLine());
		
		System.out.println("The IPL team name is: "+Team_name);
		System.out.println("It's captain name is: "+cap_name);
		System.out.println("It has the best win Percentage of: "+per);
		System.out.println("Number of Indian batsmen are: "+Ind);
		System.out.println("Number of international batsmens are: "+abr);

	}
}
