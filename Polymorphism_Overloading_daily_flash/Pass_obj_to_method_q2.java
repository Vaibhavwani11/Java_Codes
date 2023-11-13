/* Q2. Write a program to overload method having parameters 
  object of the user-defined class(real-time example expected)*/
class Petrol{
}
class CNG{
}
class Car{

	void fuel(Petrol p1){
		
		System.out.println("On Petrol");
	}
	void fuel(CNG c1){
		
		System.out.println("On CNG");
	}
}
class Drive{

	public static void main(String [] args){
	
		Car obj=new Car();
		obj.fuel(new Petrol());
		obj.fuel(new CNG());
	}
}
