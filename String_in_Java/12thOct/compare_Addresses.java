//"  == " compares the Addresses
class Addresses{

	public static void main(String [] args){
	
		String s1= new String("Core2Web"); //Heap var (500)
		String s2= "Core2Web";	 //SCP(100)
		String s3= new String("Core2Web"); //Heap (600)
		String s4= "Core2Web";	//SCP(100)

		System.out.println(s1==s2); //False
		System.out.println(s1==s3); //False
		System.out.println(s2==s4); //True


	}
}
