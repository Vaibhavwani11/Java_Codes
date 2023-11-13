class multArray{

	public static void main(String [] args){
	
		int marr[][]={{1,2,3},{5},{7,8}};
		//matrix of 3 rows and 3 columns
		//but having only 1 element for 2nd col
		//So,this will give ArrayIndexOutofBoundsException 
		
		//int marr[][]={{1,2,3},{5,,},{7,8,}}; {Error}
		
		for(int i=0; i<3;i++){
		
			for(int j=0; j<3;j++){
			
				System.out.print(marr[i][j]);
			}
			System.out.println();	
		}
	}
}
