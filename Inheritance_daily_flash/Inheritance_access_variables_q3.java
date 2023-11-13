/*3. Write a java code to declare two variables one in GrandParent class 
 second in Parent class and write addition() method in child class which prints the addition of those variables.

(Note:- Use Multilevel Inheritance)*/
class GrandParent{

	int var1=10;
}
class Parent extends GrandParent{

	int var2=20;
}
class Child extends Parent{

	void addition(){
	
		System.out.println("Addition ="+(var1+var2));
	}
	public static void main(String [] args){
		
		Child c=new Child();
		c.addition();
	}
}
