public class MyOuter{

	public static class MyInner{
	
		public static void foo(){
		
		}
	}
}
class Test{

	public static void main(String [] args){
	
		MyOuter.MyInner m=new MyOuter.MyInner();
		//Object can be created by this way
	}
}
