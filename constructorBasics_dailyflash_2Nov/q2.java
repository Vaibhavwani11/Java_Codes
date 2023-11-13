/*Q2 Write a Java Program and print all the variables in the constructor*/
class Print{

//	int a=10;
//	int b=20;

	Print(){
		int a=10;
		int b=20;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args){
		
		Print obj=new Print();
	}
}
