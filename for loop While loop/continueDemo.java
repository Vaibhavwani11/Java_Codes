class Continue{

	public static void main(String [] arhs){
	
		for (int i=1; i<=20; i++){
		
			if(i%5==0 || i%3==0 )
				continue;
			
			else
				System.out.println(i);
		}
	}

}
