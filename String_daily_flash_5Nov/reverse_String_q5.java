/*1) Write a code of Java, to accept a string from user and 
 print it in reverse order using char Array*/
import java.util.*;
class Reverse{

	public static void main(String [] args){
	
		Scanner sc=new Scanner(System.in);
		
		char []carr=new char[5];
		for(int i=0; i<carr.length; i++){
			
			carr[i]=sc.next().charAt(0);
		}
		
		for(int i=(carr.length-1); i>=0; i--){
		
			System.out.print(carr[i]);	
		}
	}	
}

