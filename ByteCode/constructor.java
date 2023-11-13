class byteDemo{
	
	byteDemo(){
		System.out.println("Print in costructor");
	}
	
	public static void main(String [] args){

		System.out.println("Print in main");
		byteDemo object =new byteDemo();  //constructor is called when object is made.
	}		
}
