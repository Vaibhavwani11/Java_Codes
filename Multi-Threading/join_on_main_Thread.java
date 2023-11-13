class MyThread extends Thread{

	static Thread mainDhaga= null;

	public void run(){
	
		//System.out.println(MyThread.mainDhaga);
		try{
		
			mainDhaga.join();  //ata mainDhaga madhe "main" Thread ahe
		}
		catch(InterruptedException ie){
		
		}	
	
		for(int i=0; i<30; i++){
		
			System.out.println("In run");
		}
	}
}
class joinDemo{

	public static void main(String [] args) throws InterruptedException{
	
		MyThread mt= new MyThread();
		mt.start();
		
		MyThread.mainDhaga= Thread.currentThread();// mainDhaga ya static var. mdhe currentThread() store kela

		for(int i=0; i<30; i++){
		
			System.out.println("In main");
		}
	}
}
