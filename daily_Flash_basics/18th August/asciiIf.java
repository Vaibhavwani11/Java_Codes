
/*
 Write a program to check whether the character is an alphabet, a digit or a special character
Input:- *
Output:- * is a special character
 */
class dailyFlash{
public static void main(String [] args){

	char ch='*';

	if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
	
		System.out.printf("%c is an Alphabet\n",ch);
	}
	else if(ch>=48 && ch<=57){
	
		System.out.printf("%c is a digit\n",ch);
	}
	else{
	
		System.out.printf("%c is a special character\n",ch);

	}
}
}
