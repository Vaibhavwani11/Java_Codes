/*4. Take2 constructors having following prototypes 
 -- void <your-class-name> (int side) prints area of square
 -- void <your-class-name> (int Len, int breath) print area of rectangle
 Create 2 separate objects inside main*/
class Area{
	
	Area(int side){
		
		System.out.println("Area of Square= "+side*side);
	}
	Area(int len,int breath){
	
		System.out.println("Area of Rectangle= "+len*breath);
	}

	public static void main(String [] args){
		
		Area obj1= new Area(5);
		Area obj2= new Area(10,7);
	}
}
