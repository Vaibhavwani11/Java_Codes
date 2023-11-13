
class Continue{

	public static void main(String [] arhs){
	
		int i=1;

		while (i<=20){
		
			if(i%5==0 || i%3==0 ){
				i++;
				continue;
				//i++;		Unreachable statement
			}	
			
			else
				System.out.println(i);
		i++;
		}
	}

}
