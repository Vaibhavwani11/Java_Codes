//Return Type: String
//Joints 2 Strings
//concated String goes to Heap
class concatDemo{

	public static void main(String [] args){
	
		String s1= "Vaibhav"; //SCP
		String s2= "Wani";    //SCP

		s1.concat(s2); //Heap 

		System.out.println(s1); //Vaibhav
		System.out.println(s2); //Wani

		System.out.println(s1.concat(s2)); //VaibhavWani
		
		s1= s1.concat(s2); 
		
		System.out.println(   s1); //VaibhavWani
		System.out.println(s2);	   //Wani
		
		System.out.println(s1.concat(s2)); //VaibhavWaniWani

	}
}
