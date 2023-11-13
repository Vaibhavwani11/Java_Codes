class MultiThreading extends Thread {

	public void run(){
	
		System.out.println("In run");
	}
	public void run(int x){
	
		System.out.println("In Overloaded run");

	}
}
class Vaibhav{

	public static void main(String [] args){
	
		MultiThreading obj=new MultiThreading();
		obj.start();
		
		obj.run(10);  
	}
}
