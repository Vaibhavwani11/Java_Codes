class MultiThreading implements Runnable{

	public void run(){
	
		System.out.println("In run");
		String threadName= Thread.currentThread().getName();
        System.out.println(threadName); //Thread-0
	}
// }
// class Vaibhav{

	public static void main(String [] args){
	
		MultiThreading t=new MultiThreading();

		Thread obj=new Thread(t); //because start is method of Thread class
		obj.start();

		System.out.println("In main");
		String threadName= Thread.currentThread().getName();
       // System.out.println(threadName); //main

	}
}
