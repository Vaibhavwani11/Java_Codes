class Parameter{

	public static void main(String [] args){
	
		StringBuffer sb= new StringBuffer('A');

		System.out.println(sb); //
		System.out.println(sb.capacity()); //65 (ASCII value)
		
		StringBuffer sb1= new StringBuffer(500);

		System.out.println(sb1); //
		System.out.println(sb1.capacity()); //500
	}
}
