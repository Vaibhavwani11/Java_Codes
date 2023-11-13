//import java.lang.*
class Aambe{ //extends Object
	
      //constructor      
      int x=12;
      static int y=5;   //static block is added in b.c

	void Eatmore(){
	
		System.out.println("Gain Weight");
	}
	static void lockdownExtend(){

		System.out.println("Mood Spoil");
	}
}
class Home{

	public static void main(String[] args){
		
		Aambe varanbhat= new Aambe();
		varanbhat.Eatmore();
		Aambe.lockdownExtend();
	
	}
}
