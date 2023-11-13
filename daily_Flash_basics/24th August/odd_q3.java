
/*
 Write a program to print first 50 even numbers
Output: 1 3 5...99
 */
class odd{
public static void main(String [] args){

	int i=1,cnt=1;
	while(cnt<=50){
	
		if(i%2!=0){
		
			System.out.printf("%d ",i);
			cnt++;
		}
		i++;
	}
	System.out.println(" ");
	}
}

