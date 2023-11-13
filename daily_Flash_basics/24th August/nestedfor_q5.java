/*
 Write a program to print following pattern
 Output:0 0 0 0 
        0 0 0 0
	0 0 0 0 
	0 0 0 0
 */
class pattern{
public static void main(String [] args){
	
	int cnt=1;
	for(int rows=1; rows<=4; rows++){
	
		for(int cols=1; cols<=4; cols++){
	
			System.out.printf(" 0");
		}
	System.out.printf("\n");	
	}
}

}
