/*5. Write a real-time example of multilevel inheritance on Google Company*/
class Alphabet{
	
	Alphabet(){
		System.out.println("Alphabet is Parent Company of Google");
	}
}
class Google extends Alphabet{
	Google(){
		System.out.println("Google is Parent Company of Chrome");
	}
}
class Chrome extends Google{
	Chrome(){
		System.out.println("Chrome is browser");
	}
}
class user{

	public static void main(String [] args){
	
		Chrome c=new Chrome();
	}
}
