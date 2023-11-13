/*Program 2. Write a Java program that contains the following classes:
- Credit Card 
- DebitCard
 The implementation of the classes can be of your choice.
 Write a Payment class, with overloaded method makePayment() for the parameters CreditCard and DebitCard respectively.
 Print in the method that is being used.
 Write class Demo that has main(), make the call to the overloaded method.*/
class Creditcard{
}
class Debitcard{
}
class Payment{
	
	void makePayment(Creditcard c1){
		
		System.out.println("Payment through Credit card");
	}
	void makePayment(Debitcard d1){
		
		System.out.println("Payment through Debit card");
	}
}
class Demo{

	public static void main(String [] args){
	
		Payment obj=new Payment();
		obj.makePayment(new Creditcard());
		obj.makePayment(new Debitcard());
	}
}
