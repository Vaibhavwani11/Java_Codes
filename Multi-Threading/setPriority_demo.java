class PriorityDemo extends Thread{

	public void run(){
	
		System.out.println(Thread.currentThread().getPriority());
		for(int i=0; i<15; i++){
		
			System.out.println("Thread having prio=10");
		}
	}
}
class ThreadScenario{

	 public static void main(String [] args){
	
		 PriorityDemo obj=new PriorityDemo();
		 obj.start();
		 obj.setPriority(10);
			
		System.out.println(Thread.currentThread().getPriority());
	
	       	for(int i=0; i<15;i++){
		 
			System.out.println("Thread having prio=5");
		 }
	}
}
