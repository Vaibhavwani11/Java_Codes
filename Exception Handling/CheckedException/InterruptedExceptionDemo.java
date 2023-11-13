class InterruptedExceptionDemo{

	public static void main(String [] arbs){ //throws InterruptedException{
	
		Thread t=new Thread();
		t.start();
		
		System.out.println("Vaibhav");
		t.sleep(5000);
		
		System.out.println("MahaTours");
	}
}
