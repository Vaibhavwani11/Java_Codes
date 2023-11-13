/*4. Write a program to take two strings from the user and append each character from the
two strings alternatively but the second string must be operated reversely and print the
result. (Note: Use of String Builder is a must.) 
Input :-Enter 1st String :Core2web
	Enter 2nd String : Technologies

Output:- Result = Csoerieg2owleobnhceT*/
import java.io.*;
class ReverseAppend{

	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);

	public static void main(String [] args)throws IOException{
		
		StringBuider sb1=new StringBuilder(br.readLine());

		System.out.println(sb1);
	}
}
