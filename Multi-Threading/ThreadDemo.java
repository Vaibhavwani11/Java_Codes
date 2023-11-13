class MultithreadingDemo extends Thread {
	public void run()
	{
        System.out.println("In run method!");
        String threadName= Thread.currentThread().getName();
        System.out.println(threadName);
	}
}
public class Multithread {
	public static void main(String[] args)
	{
		MultithreadingDemo obj= new MultithreadingDemo();
		obj.start();
		
        System.out.println("In main");
        String threadName= Thread.currentThread().getName();
        System.out.println(threadName);
    }
	
}
