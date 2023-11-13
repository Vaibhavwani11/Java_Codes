/*5) Write an array that stores, 10 instances of class Demo.
  Make 10 objects of class Demo and put it in Demo array.*/
class Demo{

	public static void main(String [] args){
	
		Demo arr[]=new Demo[5];
		
 		Demo d1=new Demo();
		Demo d2=new Demo();
		Demo d3=new Demo();
		Demo d4=new Demo();
		Demo d5=new Demo();
	
		arr[0]=d1;
		arr[1]=d2;
		arr[2]=d3;
		arr[3]=d4;
		arr[4]=d5;
	
		for(int i=0; i<5; i++)
			System.out.println(arr[i]);
	
	}
}
