class UnsignedDemo{
	public static void main(String [] args){
			int num=188;
			int num1=255;
			int num2=-108;
			int num3=-123;
			int result=0;
				
			result=num>>>4;			//unsigned Right Shitft
			System.out.println(result);	//Shortcut trick:(188/16)=11
		
			result=num1<<<3;			//unsigned left Shitft
			System.out.println(result);	//error
			
			result=num2>>>23;			//unsigned Right Shitft
			System.out.println(result);	//Shortcut trick:(108/23)=11
		
			result=num3<<<15;			//unsigned left Shitft
			System.out.println(result);	//error
	
		
		
	}	
}/*Conclusion:- Unsigned left shift is not applicable

*/