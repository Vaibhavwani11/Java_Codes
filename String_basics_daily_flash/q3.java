/*3) Store one hardoced string, in string literal and another hardcoded string in, string object.
 And comment how they are stored on String constant pool and heap.*/
class StringTypes{

	public static void main(String [] args){
	
		String s1="String Literal which will get space on SCP";
		
		String s2=new String("String Object which will get space on Heap");

		System.out.println(s1+"\n"+s2);
	}
	//
}
