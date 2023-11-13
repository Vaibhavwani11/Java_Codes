/*Take number of overs from user. Calculate the total number of balls by the value of total overs 
  and create an array of runs of size of calculated number of total balls. 
 (i.e if overs are 2 then take array of size 12). Take runs from the user. Then print the following:
 1.total Score
 2.total number of balls
 3.total number of Sixes(i.e 6)
 4.total number of fours(i.e 4) 
 5.total number of others(i.e 1,2 or 3)*/
import java.util.*;
class Match{

	public static void main(String [] args){
	
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Number of Overs: ");
		int overs=sc.nextInt();
		
		int arr[]=new int[overs*6];
		
		int score=0,six=0,four=0,oth=0;

		for(int i=0; i<arr.length; ){
			
			arr[i]=sc.nextInt();

			if(arr[i]<0 || arr[i]>6 || arr[i]==5){

				System.out.println("Invalid Score");
			
			}	
			else{
				score= score + arr[i];
				
				if(arr[i]==6)
					six++;
			
				else if(arr[i]==4)
					four++;
				
				else if(arr[i]==1 || arr[i]==2 || arr[i]==3)
					oth++;		
			i++;
			}	
		}

		System.out.println("Total Score= "+score);
		System.out.println("Balls= "+(overs*6));
		System.out.println("Sixes= "+six);
		System.out.println("Fours= "+four);
		System.out.println("Others= "+oth);

	}
}
