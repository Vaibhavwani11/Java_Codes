class firstThread extends Thread{

	public void run(){
	
		System.out.println(Thread.currentThread().getName());
		System.out.println("In run of:"+currentThread().getName());
	
		newThread();
	}
	void newThread(){
	
		secondThread t2=new secondThread();
		t2.start();
	}
}
class secondThread extends Thread{

	public void run(){
	
		System.out.println(Thread.currentThread().getName());
		System.out.println("In run of: "+getName());
	}
}
class Vaibhav{

	public static void main(String [] args){
	
		firstThread t1=new firstThread();
		t1.start();
	}
}
