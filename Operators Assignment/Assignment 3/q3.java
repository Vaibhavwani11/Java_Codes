class BitwiseDemo{
	public static void main(String [] args){
		int num1=10;
		int num2=5;
		int ans=0;
	
		ans=(num1++ | num2) & ((++num2 )^num1);	//(10 | 5) & ((6)^11)
		System.out.println(ans);	//13	
	}
}  // 10=0000 1010
   //  5= 0000 0101
   // 10 | 5= 0000 1111=15
 
   // 6=0000 0110
   // 11=0000 1011
   // 6^11=0000 1101=13 
	
  // 15 & (13) = 1111 & 1101= 1101=13