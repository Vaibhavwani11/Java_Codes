interface Anonymous{

 	public int getValue();
}
public class Outer{

	private int data=15;
	public static void main(string [] args){
	
		Anonymous inn=new Anonymous();{
		
			int data=5;
			public int getValue(){
			
				return data;
			}
			//public int getData(){
			
			//	return data;
			//}
		};
		Outer out=new Outer();
		System.out.println(inn.getValue()+inn.getData()+ out.data);
	}
}
//getData is not defined in Anonymous class which causes error
