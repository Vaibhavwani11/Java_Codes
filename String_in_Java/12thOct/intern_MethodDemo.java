//By using intern() Method we can transfer the String from Heap to SCP
class InternMethod{

	public static void main(String [] args){
	
		String s1= new String("Biencaps"); //Heap var (500)
		String s2= "Biencaps";    //SCP (200)

		System.out.println(s1==s2); //500!=200 i.e. False

		s1= s1.intern();  //s1 will refer to SCP i.e. 200 address instead of 500 

		System.out.println(s1==s2); //True
	}
}
