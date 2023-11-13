/*Program 5. Write a real-time example for overloading*/
class Contact{

	void createContact(long num,String name){
	
		System.out.println("Number= "+num+" Name= "+name);
	}
	void createContact(long num){
	
		System.out.println("Number= "+num);
	}
	public static void main(String [] args){
	
		Contact obj=new Contact();
		obj.createContact(7841816325l,"Vaibhav");
		obj.createContact(8805318079l);
	}
}

