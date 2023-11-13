class Alphabet{

	Alphabet(){
	
		System.out.println("In A constructor");
	}
	void youTube(){
	
		System.out.println("a yT");
	}
}

class Google extends Alphabet{

	Google(){
	
		System.out.println("In G constructor");
	}
	void youTube(){
	
		System.out.println("g YT");
	}
	void Search(){
	
		System.out.println("Function");
	}
	public static void main(String [] args){
	
		Google obj=new Google();
		obj.Search();
		obj.youTube();

		Alphabet a=new Google();
		a.youTube();
	}
}
