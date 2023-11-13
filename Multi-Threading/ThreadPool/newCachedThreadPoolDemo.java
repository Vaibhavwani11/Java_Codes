import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
class CachedThreadDemo implements Runnable{

	int workNum;
	CachedThreadDemo(int workNum){
	
		this.workNum=workNum;
	}
	public void run(){
	
		System.out.println(Thread.currentThread().getName()+" Start Task:"+workNum);
		//workAssign();
		System.out.println(Thread.currentThread().getName()+" End Task:"+workNum);
	}
	/*void workAssign(){
	
		try{
			Thread.sleep(3000);
		}
		catch(InterruptedException ie){
		
		}
	}*/

}
class ThreadExec{

	public static void main(String [] args){
	
		ExecutorService es = Executors.newCachedThreadPool();

		for(int i=0; i<35; i++){
		
			CachedThreadDemo work = new CachedThreadDemo(i);
			es.execute(work);
		}
		es.shutdown();
	}
}
