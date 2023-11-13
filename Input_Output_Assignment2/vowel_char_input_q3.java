/*Question 3. Write a program in java to take single character as input and check whether the entered
character as vowel or consonant.
Input:
a
Output:
a is Vowel.
Input :
V
Output :
V is a consonant
*/

import java .io.*;
class vowel{

	public static void main(String [] atgs)throws IOException {
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.println("Enter the Character: ");
		char ch= (char)br.read();

		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u'){
		
			System.out.printf("%c is a vowel",ch);		
		}
		else{
		
			System.out.printf("\n %c is a Consonant",ch);
		}
	}
}
