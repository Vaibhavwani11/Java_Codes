class MyThread extends Thread{

	public void run(){
	
		for(int i=0; i<10; i++){
		
			System.out.println("In run Method");
		}
	}
}
class joinDemo{

	public static void main(String [] args) throws InterruptedException{
	
		MyThread mt =new MyThread();
		mt.start();
		mt.join(); //adhi purn Thread-0 execute hoil nntr main kde yeil

		for(int i=0; i<10; i++){
		
			System.out.println("In main Method");
		}

	}
}
