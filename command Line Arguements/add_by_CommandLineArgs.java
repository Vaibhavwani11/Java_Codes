class cmdAdd{

	public static void main(String [] args){

		try{
		
			System.out.println((Float.parseFloat(args[0]))+(Integer.parseInt(args[1])));
		}//System.out.println(((char)args[0])+((char)args[1]));
		catch(NumberFormatException ref){
		
			System.out.println("Input Chuckla re");
		}
	}
}
