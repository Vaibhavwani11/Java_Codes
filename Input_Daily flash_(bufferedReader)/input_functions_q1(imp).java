/*
 Take a class name IPLTeam, declare instance variable as String teamName, int jersyNum, 
 String captainName, int countOfTrophiesWon.
 Now inside main() method take input from user make object of IPLTeam class,and
 assign each variable a respective value and print them.
Input: Enter team name: MI
       Enter captain name: Rohit Sharma
       Enter jersy number of Rohit Sharma:45 
 */
import java.io.*;
class IPLTeam{

//	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
/* {We can make object of Buff.. here also bt it will be considered as instance var. So,for accesing through static method 
   we have to access through object i.e. obj.br.readLine()*/
	
	String teamName;
	int jersyNum;
	String captainName;
	int countOfTrophies;

	public static void main(String [] args) throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		IPLTeam obj= new IPLTeam();
		
		System.out.println("Enter Team Name:");
		obj.teamName=br.readLine();  	
				
		System.out.println("Enter jersyNum:");
		obj.jersyNum=Integer.parseInt(br.readLine());

		System.out.println("Enter captain Name:");
		obj.captainName=br.readLine();
		
		System.out.println("Number of Trophies Won: ");
		obj.countOfTrophies=Integer.parseInt(br.readLine());
		
		System.out.println("Team Name: "+obj.teamName);
		System.out.println("Captain Name= "+obj.captainName);		
		System.out.println("Jersy Num= "+obj.jersyNum);
		System.out.println("Trophies Won= "+obj.countOfTrophies);
	}
}
