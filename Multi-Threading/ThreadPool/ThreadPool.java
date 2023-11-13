import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
class ThreadPoolDemo implements Runnable{
	
	String workNum=null;

	ThreadPoolDemo(String workNum){
		
		this.workNum=workNum;
	}
	public void run(){
	
		sleepTask();
		System.out.println(Thread.currentThread().getName()+"Start Task "+workNum);
		//System.out.println(Thread.currentThread().getName()+"End Task "+workNum);
	}
	void sleepTask(){
	
		try{
		
			Thread.sleep(3000);
		}
		catch(InterruptedException ie){
		
			System.out.println("Catched");
		}
	}
}
class MyThreadPool{

	public static void main(String [] args){

		ExecutorService exec= Executors.newFixedThreadPool(10);

		for(int i=0; i<20; i++){

			ThreadPoolDemo work= new ThreadPoolDemo(""+i);
			exec.execute(work);	
		}
		exec.shutdown();
	}
}
