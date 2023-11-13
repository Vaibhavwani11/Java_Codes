class ThreadDemo extends Thread{

	static Thread yachName= null;

	public void run(){
	
		System.out.println(ThreadDemo.yachName);

		//ThreadDemo.yachName.setName("Wani");
	
		System.out.println(Thread.currentThread().getName());
	}
}
class Myclass extends Thread{

	public static void main(String [] args){
	
		ThreadDemo obj=new ThreadDemo();
				
		obj.start();
		obj.setName("Vaibhav");

		ThreadDemo.yachName = Thread.currentThread();
		ThreadDemo.yachName.setName("Wani");
		
		//ThreadDemo.yachName = Thread.currentThread();
			
		System.out.println("In main "+Thread.currentThread().getName());
	}
}
