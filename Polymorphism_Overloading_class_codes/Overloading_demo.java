//Overloading:-
//Same method name bt different Parameters
class addDemo{

	void add(int x,int y){
	
		System.out.println(x+y);
	}
	void add(int x,int y,int z){
		
		System.out.println(x+y+z);
	}
	public static void main(String [] args){
	
		addDemo obj=new addDemo();
		obj.add(10,20);
		obj.add(10,20,30);
	}
}
