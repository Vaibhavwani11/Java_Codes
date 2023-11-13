class ThreadGroupExec extends Thread{

	ThreadGroupExec(String tName){
		
		super(tName);
	}
	public void run(){
	
		System.out.println(Thread.currentThread().getName());
	}
}
class ThreadGrp{

	public static void main(String [] args){
		
		ThreadGroup tg1 = new ThreadGroup("Parent Group");

		ThreadGroupExec t1= new ThreadGroupExec("First");
		//ThreadGroupExec t2= new ThreadGroupExec();
		//ThreadGroupExec t3= new ThreadGroupExec();

		t1.start();
		//t2.start();
		//t3.start();	
	}
}
