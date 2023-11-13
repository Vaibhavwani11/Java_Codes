//newSingleThreadExecutor ne Thread banvla tr ekach Thread Sagle tast step by step karel

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
class SingleThreadExec implements Runnable{

	int workNum;
	SingleThreadExec(int workNum){
	
		this.workNum=workNum;
	}
	public void run(){
	
		System.out.println(Thread.currentThread().getName()+" Start Task:"+workNum);
		workAssign();
		System.out.println(Thread.currentThread().getName()+" End Task:"+workNum);
	}
	void workAssign(){
	
		try{
			Thread.sleep(3000);
		}
		catch(InterruptedException ie){
		
		}
	}

}
class ThreadExec{

	public static void main(String [] args){
	
		ExecutorService es = Executors.newSingleThreadExecutor();

		for(int i=0; i<35; i++){
		
			SingleThreadExec work = new SingleThreadExec(i);
			es.execute(work);
		}
		es.shutdown();
	}
}
