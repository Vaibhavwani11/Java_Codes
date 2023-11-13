class ThreadDemo extends Thread{

	public void run(){

		for(int i=0; i<5; i++){
		
			System.out.println("Biencaps");
		}
		System.out.println("In run Thread");
		String ThreadName= Thread.currentThread().getName();
		System.out.println("Thread Name= "+ThreadName);	
	}
	public static void main(String [] args){
	
		ThreadDemo t=new ThreadDemo();
		//t.run();

		t.start();
		for(int i=0; i<5; i++){
		
			System.out.println("Core2web");
		}

		System.out.println("In main Thread");
		String ThreadName= Thread.currentThread().getName();
		System.out.println("Thread Name = "+ThreadName);
	}
}
