/*Program 3. Write a Java program that contains a class Shape which has an overloaded method makeShape() and 
 the parameters of the same should be:
 -(int) should print:-) "Square is to be drawn with side: intValue."
 -(int,int) should print:-) "Rectangle is to be drawn with length intValue 1 and breadth intValue2."
 -(float) should print:-) "Circle is to be drawn with radius: floatValue."*/
class Shape{
	
	void makeShape(int x){
			
		System.out.println("Square to be drawn with side"+x);
	}	
	void makeShape(int x,int y){
			
		System.out.println("Rectangle to be drawn with length "+x+"and breadth "+y);
	}	
	void makeShape(float x){
			
		System.out.println("Circle to be drawn with radius "+x);
	}	
}
class Pass{
	
	public static void main(String [] args){
	
		Shape obj=new Shape();
		obj.makeShape(10);
		obj.makeShape(10,20);
		obj.makeShape(22.5f);
	}
}
