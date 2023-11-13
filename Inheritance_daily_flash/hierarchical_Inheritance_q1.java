/*1. Write a real-time example for Hierarchical inheritance on Indian Festivals.
(Note:- At least 3 classes)*/
class IndianFestivals{
	IndianFestivals(){
	
		System.out.println("This is a Indian Festival");
	}
	
}
class Dasara extends IndianFestivals{
	
	Dasara(){
		
		System.out.println("Dasara!");
	}
}
class Diwali extends IndianFestivals{
	
	Diwali(){
		
		System.out.println("Diwali!");
	}

}
class Shivjayanti extends IndianFestivals{
	Shivjayanti(){
		System.out.println("ShivJayanti!");
	}
	
}	
class fest{
	public static void main(String [] args){
		Dasara d=new Dasara();
	}
}
