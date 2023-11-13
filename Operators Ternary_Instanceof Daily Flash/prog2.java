class Instagram{
	
	static void Followers(){
		System.out.println("Followers goal=1k");	
		System.out.println("Current followers=700");

		Instagram object =new Instagram();
		System.out.println(object instanceof Instagram);
	}
	void Posts(){
		System.out.println("Post Nature clicks");
		System.out.println("Portraits are Best");
	}
}
class Facebook{
	public static void main(String [] args){
		Instagram obj= new Instagram();
		obj.Followers();
		
		obj.Posts();
	}

}