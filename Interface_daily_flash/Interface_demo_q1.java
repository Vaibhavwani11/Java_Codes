/*1. Write a java program having one interface RBI having repoRate() one method and then a class SBI implementing this interface.*/
interface RBI{

	void repoRate();  //by default This is "public abstract"
}
class Tjsb implements RBI{

	public void repoRate(){  //Scope cannot be decreased,so method must be Public
	
		System.out.println("9.35");
	}
	public static void main(String [] args){
	
		RBI o=new Tjsb();
		o.repoRate();
	}
}
