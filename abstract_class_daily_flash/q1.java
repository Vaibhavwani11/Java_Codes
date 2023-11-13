/*1) Create an abstract class 'Bank' with an abstract method 'getBalance'. 100, 150 and 200 are deposited in banks SBI, HDFC and AXIS respectively. 'SBI', 'HDFC' and 'AXIS' are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.*/
abstract class Bank{

	abstract void getBalance();
}
class SBI extends Bank{

	int depo=100;
	void getBalance(){
	
		System.out.printf("Amount= %d\n",depo);
	}
}
class HDFC extends Bank{

	int depo=150;
	void getBalance(){
	
		System.out.printf("Amount= %d\n",depo);
	}
}
class AXIS extends Bank{

	int depo=200;
	void getBalance(){
	
		System.out.printf("Amount= %d\n",depo);
	}
}
class Customer{

	public static void main(String [] args){
	
		Bank s=new SBI();
		s.getBalance();
	
		Bank h=new HDFC();
		h.getBalance();
		
		Bank a=new AXIS();
		a.getBalance();
	}
}
