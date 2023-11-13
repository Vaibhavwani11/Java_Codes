class Core2Web{

	public static void main(String [] args){
		
		int []var1= new int[5];

		var1[2]=3;
		var1[3]=4;
		var1[4]=5;

		for(int i=0; i<var1.length; i++){
		
			System.out.print(var1[i]+" ");
		}
	}
}/*
int array is initialised with 0 by default,
so the index where no value is put explicitly contains zero
*/
