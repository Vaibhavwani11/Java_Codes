/*
 Write a program using while loop to print firt 10 numbers which are divisible 32 & 7
 (don't print if num is divisible by 32 7 and 6 also)
 */
class prog3{
	
	public static void main(String [] args){
	
		int cnt=1;
		int num=1;

		while(cnt<=10){
		
			if(num%32==0 && num%7==0){

				if(num % 6==0){
					num++;
					continue;
				}
			
			System.out.println(num);
			cnt++;
			}
		num++;	
		}
	}
}
