/*1) Store one hardoced string, in string literal and another hardcoded string in string object,
and print both the strings separated by space*/
class StringTypes{

	public static void main(String [] args){
	
		String s1="String Literal which will get space on SCP";
		
		String s2=new String("String Object which will get space on Heap");

		System.out.println(s1+"\n"+s2);

	}
}
