class ThreadNameChange extends Thread{

	public void run(){
	
		System.out.println("In Run Method");
		System.out.println(currentThread().getName());
		
	}
}
class ThreadDemo{

	public static void main(String [] args) throws InterruptedException{
	
		ThreadNameChange obj=new ThreadNameChange();
		System.out.println(Thread.currentThread().getName());
		obj.start();
		//obj.sleep(3000);
		obj.setName("New Thread");
		
		for(int i=0; i<10; i++){
		
			System.out.println("Hello");
		}
	
		obj.sleep(3000);
	}
}
