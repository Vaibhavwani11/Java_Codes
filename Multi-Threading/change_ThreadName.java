class ThreadDemo extends Thread{

	public void run(){
	
		// System.out.println(Thread.currentThread().getName());
	}
}
class Myclass extends Thread{
	
	public static void main(String [] args){
	
		// ThreadDemo obj=new ThreadDemo();
		// obj.start();
		// obj.setName("Vaibhav");


		// Myclass m=new Myclass();
		// m.start();
		// m.setName("Wani");

		/*Thread t=new ThreadDemo();
		t.start();
		t.setName("Veritas");
		*/
		System.out.println(Thread.currentThread().getName());
	}
}
