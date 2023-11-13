/*2) Write a code of Java, to accept a string from user and
  find length of String, using character array*/
import java.util.*;
class Length{

	public static void main(String [] args){
	
		Scanner sc=new Scanner(System.in);

		char []carr=new char[10];
		
		for(int i=0; i<carr.length; i++){
	
			carr[i]=sc.next().charAt(0);				
		}
	}
}
