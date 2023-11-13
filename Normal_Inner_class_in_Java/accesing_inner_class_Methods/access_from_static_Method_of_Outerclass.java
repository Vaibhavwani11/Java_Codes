//Call on Object of Outer class
class Outer{
	
	class Inner{
	
		void main(){
			
			System.out.println("IN Inner class Method");
		}
	}
	public static void main(String []  args){
	
		new Outer().new Inner().main();
	    //OR
		Inner obj= new Outer().new Inner();
		obj.main();
	    //OR
		Outer o=new Outer();
		Outer.Inner i=o.new Inner();  //Or Inner i=new Inner();
		i.main();

	}
}
