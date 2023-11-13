/*
 Write a program to print cube of first 20 numbers
Output: cube of 1: 1
	cube of 2: 8
	cube of 3: 27
	...
	cube of 20: 8000
 */
class Cubes{

	public static void main(String [] args){
		
		int num=1;
		while(num<=20){
		
			System.out.printf("cube of %d: %d\n",num,num*num*num);
		num++;	
		}
	}
}
