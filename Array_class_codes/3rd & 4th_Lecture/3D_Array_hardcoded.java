class array_3D{

	public static void main(String [] args){
	
		int marr[][][]={{{1,2,3},{4,5,6},{7,8,9}},{{11,12,13},{14,15,16},{17,18,19}}};
		//Two planes, 3 rows and 3 cols

		for(int i=0; i<2; i++){
			System.out.println(i + " Plane are:");

			for(int j=0; j<3; j++){
			
				for(int k=0; k<3; k++){
					System.out.print(marr[i][j][k] + " ");
				}
			System.out.println();	
			}
		}
	}
}
