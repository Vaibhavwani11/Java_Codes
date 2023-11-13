class ThreadDemo extends Thread{

	public void run(){

		System.out.println("In run Thread");
		String ThreadName= Thread.currentThread().getName();
		System.out.println("Thread Name= "+ThreadName);	
	}
	public static void main(String [] args){
	
		ThreadDemo t=new ThreadDemo();
		t.run();

		//t.start();

		System.out.println("In main Thread");
		String ThreadName= Thread.currentThread().getName();
		System.out.println("Thread Name = "+ThreadName);
	}
}
