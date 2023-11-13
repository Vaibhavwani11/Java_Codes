/*
 Write a program to print sum of first 10 natural numbers
Output: Sum of first 10 natural numbers=55
 */
class sum{
public static void main(String []args){

	int sum=0;

	for (int i=1; i<=10; i++){
	
		sum = sum+i;
	}
	System.out.printf("Sum of first 10 natural numbers=%d\n",sum);
}
}
