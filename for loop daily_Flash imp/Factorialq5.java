/*
 Write a java program to print series of factorials ranging upto that number from 1.
 * */
class Factorial{

	public static void main(String [] args){
	
		int  fact=1;
		int cnt=1;
		int num=12;
	
		while(cnt<=num){
		
			fact=fact*cnt;

			System.out.println("Factorial of "+cnt+"="+fact);
			cnt++;
		}
	
	}

			
	
}

