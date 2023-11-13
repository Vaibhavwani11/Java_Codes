/*Q2. there are two three ways to overload methods in java 
 * 1.By changing number of arguments *
 * 2.By changing the data type *
 * 3.By changing Sequence of Data type of parameters. 
 write a program to perform all these ways*/
class OverloadDemo{
  // 1.By changing number of arguments
 	void m1(int x){
	
		System.out.println("1 Arguement"+x);
	}
	void m1(int a,int b){
		
		System.out.println("2 Arguements"+a+" "+b);
	}
  // 2.By changing data type
 	void m1(float x){
	
		System.out.println("Float data type "+x);
	}
	void m1(char x){
		
		System.out.println("char data type "+x);
	}
  // 3.By changing sequence of data type of parameters
 	void m1(char a,int b){
	
		System.out.println("char & int "+a+" "+b);
	}
	void m1(int a,char b){
		
		System.out.println("int & char "+a+" "+b);
	}
}
class Test{

	public static void main(String [] args){
	
		OverloadDemo obj=new OverloadDemo();
		   obj.m1(10);
		   obj.m1(10,30);

		   obj.m1(10.5f);
		   obj.m1('V');
		
		   obj.m1('a',50);
		   obj.m1(50,'a');
	}
}
