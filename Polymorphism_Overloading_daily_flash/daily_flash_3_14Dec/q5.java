/*Q5.Create a class named "Rectangle' with two data members 'length' and 'breadth' * and two methods to print the area and perimeter of the rectangle respectively.
* Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle.
* Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter
for its side (suppose s) * calling the constructor of its
parent class as 'super(s,s)'. * Print the area and perimeter of a rectangle and a square.*/
class Rectangle{

	Rectangle(int len,int br,int side){
		
	}	
	void area(){
	
		int l=this.len;
		int b=br;

		System.out.println("Area= "+(l*b));
	}
	void Perimeter(){
	
		int l=len;
		int b=br;
		System.out.println("Perimeter= "+(2*l+2*b));
	}
}
class Square extends Rectangle{
		
	Square(){
		super();
	}
	void area(){
		s=this.s;

		System.out.println("Area= "+(s*s));
	}
	void Perimeter(){
	
		s=this.s;
		System.out.println("Perimeter= "+(4*s));
	}
}
class Test{

	public static void main(String [] args){
	
		Rectangle obj=new Rectangle(10,20,5);
		obj.area();
		obj.Perimeter();
		
		Square obj1=new Square();
		obj1.area();
		obj1.Perimeter();
	}
}
