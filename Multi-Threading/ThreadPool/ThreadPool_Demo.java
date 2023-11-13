import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class ThreadExecDemo implements Runnable{

	String workNum=null;
	ThreadExecDemo(String workNum){
	
		this.workNum=workNum;
	}
	public void run(){
	
		System.out.println(Thread.currentThread().getName()+" Start Task"+workNum);
		System.out.println(Thread.currentThread().getName()+" End Task"+workNum);
	}
}
class MyThreadExecutor{

	public static void main(String [] args){
	
		ExecutorService exec=Executors.newFixedThreadPool(10);

		for(int i=0; i<10; i++){
		
			ThreadExecDemo work=new ThreadExecDemo(""+i);
			exec.execute(work);
		}
		exec.shutdown();
	}
}
