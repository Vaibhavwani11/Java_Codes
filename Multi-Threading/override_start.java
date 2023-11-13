class MultiThreading extends Thread{

	public void run(){
	
		System.out.println("In run method");
		System.out.println(getName());
		
	}

	public void start(){
		
		run();
		System.out.println("In start method");
	}
}
class Vaibhav{

	public static void main(String [] args){
		
		MultiThreading t1= new MultiThreading();//Thread-0 initialised
		MultiThreading t2= new MultiThreading();//Thread-1 initialised
		MultiThreading t3= new MultiThreading();//Thread-2 initialised

		t3.start(); //call to our overrided start will be given,so run won't get execute.
	}
}
