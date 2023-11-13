/*Program 3:
Write a carModel class & create a instance variable to store model name.
Pass the model name in constructor while creating car object. 
Write one method getModelName() in car class & 
call that method in main class with the car object*/
class carModel{

	String modelName="Verna";

	carModel(String name){
		
		System.out.println("old model Name= "+modelName);
		System.out.println("In Constructor");
		modelName=name;
	}
	void getModelName(){
		
		System.out.println("new Car Name= "+modelName);
	}
	public static void main(String [] args){
		
		carModel car= new carModel("Audi");
		car.getModelName();
	}
}
