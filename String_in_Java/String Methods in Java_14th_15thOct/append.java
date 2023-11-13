class makeString{

	public static void main(String [] args){
	
		int cost=0;

		StringBuffer str= new StringBuffer("");
		
		StringBuffer finalStr= new StringBuffer("bacbacacb");
	
		//for(int i=1; i<9; i++){
		//int i=0;
		//do{		
			str.append(finalStr.substring(9));
		//i++;
	//	}
		//while(i<9);
		System.out.println(str);
		
	
		/*cost+=4;
		
		System.out.println(str);
		
		str.append(str.substring(0,2));
		System.out.println(str);*/
	}
}
