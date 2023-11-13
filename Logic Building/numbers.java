/*
 Write a program to print as follows:
0   0 
1   -1 
2   -2
3   -3
4   -4
5   -5
6   -6 
7   -7
8   -8
9   -9
10  -10
*/
class Pattern{

	public static void main(String [] args){
	
		for(int i=0,j=0; i<=10 && j<=10;i++,j--){
		
			System.out.printf(" %d   %d\n",i,j);
		}
	}
}
