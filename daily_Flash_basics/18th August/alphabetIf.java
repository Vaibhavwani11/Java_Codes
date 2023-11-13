/*
 Write a program to check whether the character is alphabet or not
Input:-v
Output:- v is alphabet
*/
class dailyflash{
public static void main(String [] args){

	char ch='V';

	if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
		
		System.out.printf("%c is an alphabet\n",ch);
	}
	else{
	
		System.out.printf("%c is not an alphabet\n",ch);
	}}
}
