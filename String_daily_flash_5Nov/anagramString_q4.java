/*4)Write a code of Java, to accept two strings from user and
find whether they are anargam using character array
But ignore the cases while comparing 
Anagram String example: shashi & ashish are Anagram Strings bcz all the characters are Common just rearranged*/
import java.util.*;
class Anagram{

	public static void main(String [] args){
	
		Scanner sc= new Scanner(System.in);

		String name1;
		String name2;

		System.out.println("Enter String 1: ");
		name1=sc.next();
		
		System.out.println("Enter String 2: ");
		name2=sc.next();
		
		int cnt=0;
		//at 1st check length 
		if(name1.length()==name2.length()){
		
			for(int i=0; i<name1.length(); i++){
			
				for(int j=0; j<name2.length(); j++){
				
					if(name1.charAt(i)==name2.charAt(j)){
						cnt++;	
						break;	//Repetations will work here
					}
				}
			}
			if(cnt==name1.length())
				System.out.println("Anagram String");	
		}

	}
}
