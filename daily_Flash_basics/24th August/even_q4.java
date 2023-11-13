
/*
 Write a program to print first 50 even numbers
Output: 2 4 6...100
 */
class even{
public static void main(String [] args){

	int i=1,cnt=1;
	while(cnt<=50){
	
		if(i%2==0){
		
			System.out.printf("%d ",i);
			cnt++;
		}
		i++;
	}
	System.out.println(" ");
	}
}

