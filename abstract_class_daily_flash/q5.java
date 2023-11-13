/*5)Create an abstract class 'PowerCalculator' and an abstract method getResult(int number). It is inherited by two classes "Square Calculator' and 'Cube Calculator'. Define getResult method in both the classes such that they result square and cube of the number passed as an argument to the method. Create object of both derived class and call the getResult method on their respective objects*/
abstract class PowerCalc{

	abstract void getResult(int num);
}
class SquareCalc extends PowerCalc{

	void getResult(int x){
		
		int sq= x*x;

		System.out.println("Square= "+sq);
	}
}
class cubeCalc extends PowerCalc{
	
	void getResult(int x){
		
		int cb= x*x*x;

		System.out.println("Cube= "+cb);
	}
}
class Student{

	public static void main(String [] args){
	
		SquareCalc s=new SquareCalc();
		s.getResult(5);
		
		cubeCalc c=new cubeCalc();
		c.getResult(5);
	}
}
