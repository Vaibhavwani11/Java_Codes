//how calls are given
class MultiThreading extends Thread{

	public void run(){   /*Thread class implements Runnable & Runnable interface has run() method which is overrided in Thread
			    here we override run method again*/
	
		System.out.println("In run");
	}
}
class Vaibhav{

	public static void main(String [] args){
	
		//Object create kelyavr Thread initialize hoto
		MultiThreading t=new MultiThreading();
		
		//start() kelyavr ready/runnable state mdhe jato..running hoto..nntr dead hoto
		t.start(); /*start() is method of Thread class 
		start mdhe start0() la call dila ahe..tithun run la call jato
		*/


	}
}
