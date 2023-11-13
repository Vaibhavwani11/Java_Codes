/*
 Write  a java program to take a number as input and print series of Prime numbers ranging upto that number from 1
 */
import java.util.*;
class PrimeSeries{

	public static void main(String [] args){

		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for (int i = 2; i <= n ; i++) {
		
			if(checkPrime(i)){
				System.out.println(i+" is a Prime Number");
			}
		}
	}
	static boolean checkPrime(int num){

		boolean isPrime=true;
		//for (int i = 2; i <=num/2; i++) {//this is fine but as same combinations repeat after root(num) so,no need to include it
		//for (int i = 2; i <= Math.sqrt(num) ; i++) {
		for (int i = 2; i*i <=num ; i++) {
			
			//System.out.println(i+" * "+i+"= "+(i*i));
			if(num%i==0){
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
}

