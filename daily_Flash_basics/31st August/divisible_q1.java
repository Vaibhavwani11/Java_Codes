/*
 Write a program to print all the numbers ranging between 1 to 100
 that are divisible by 3 or 5
Output:
	3 5 9 10...99
 */
class div{

	public static void main(String [] args){
	for(int i=1; i<=100; i++){
	
		if(i%3==0 || i%5==0)
			System.out.printf("%d ",i);
		}
	}
}
