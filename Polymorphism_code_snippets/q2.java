class Core2web{

	int noOfMembers;
	Core2web(){
	
		noOfMembers=10;
		System.out.println("In Core2web Constructor");
	}
	int noOfMembers(){
	
		return noOfMembers;
	}
}
class Biencaps extends Core2web{

	Biencaps(){
	
		noOfMembers=15;
		System.out.println("In Biencaps Constructor");
	}
	float noOfMembers(int a){
	
		return (float)noOfMembers;
	}
}
class Main{

	public static void main(String [] args){
	
		Core2web c2w=new Biencaps();
		System.out.println(c2w.noOfMembers());
	}
}
