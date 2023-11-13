
/*
 Write  a program to check whether the Character is Uppercase or Lowercase character
Input: v
Output: letter v is in lowercase
 */
class dailyFlash{
public static void main(String [] args ){

	char ch='v';
	
	if(ch>=65 && ch<=97){
	
		System.out.printf("letter %c is in Uppercase\n",ch);
	}
	else if(ch>=105 && ch<=122){
	
		System.out.printf("letter %c is in Lowercase\n",ch);
	}
}
}
