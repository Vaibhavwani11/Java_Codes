//when we try to assign tasks to threads after shutting down threads then RejectedExecutionException occurs.
//import java.util.concurrent.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class ThreadPoolExec implements Runnable{

	int workNum;
	ThreadPoolExec(int workNum){
	
		this.workNum=workNum;
	}

	public void run(){
	
		System.out.println(Thread.currentThread().getName());
		System.out.println("Start Task:"+workNum);
		
		try{
			sleepTask();
		}
		catch(InterruptedException ie){
		
		}
	}
	void sleepTask() throws InterruptedException{
	
		Thread.sleep(3000);
	}
}
class ExecDemo{

	public static void main(String [] args){
	
		ExecutorService exec=Executors.newFixedThreadPool(10); 
	
		for(int i=0; i<10; i++){
		
			ThreadPoolExec obj=new ThreadPoolExec(i);
			exec.execute(obj);
		}
		exec.shutdown();
	
		try{

		for(int i=0; i<10; i++){
		
			ThreadPoolExec te=new ThreadPoolExec(i);
			exec.execute(te);
		}
		}
		catch(java.util.concurrent.RejectedExecutionException re){
			
			System.out.println("RejectedExceutionException handled");
		}
		
	}
}
