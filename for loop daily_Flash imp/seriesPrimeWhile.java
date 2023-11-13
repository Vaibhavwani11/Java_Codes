
/*
 Write  a java program to take a number as input and print series of Prime numbers ranging upto that number from 1
 * */
class SeriesPrime{

	public static void main(String [] args){
	
		int num=12;
		int i=1;
		
		while(i<=num){
			
			int val=0;
			int cnt=1;

			while(cnt<=i){
			
				if(i%cnt==0){
				
					val++;
				}
			cnt++;	
			}

			if(val==2){
			
				System.out.println(i+" is a Prime Number");
	
			}
			
			else if(i==num){
					System.out.println(i+"is not a Prime Number");
				}
			
			i++;

		}
			
	}
	
}
