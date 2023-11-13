//Inner class can extend Outer class
class Outer{

	class Inner extends Outer{

	}

	public static void main(String [] args){
	
		Outer obj=new Outer().new Inner();
	}
}
