/*5) Accept a string from user and take a hardcoded string. 
  Print both the strings separated by one single quote (').*/
import java.util.*;
class string{

	public static void main(String [] args){
	
		Scanner sc=new Scanner(System.in);

		String s1=sc.next();
		String s2=new String(sc.next());
	
		System.out.println(s1+" ' "+s2);
	}
}
