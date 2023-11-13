
class Core2Web{

	public static void main(String [] args){
	
		int var =2;
	
		System.out.println(true== (13!=4) ? var+=4 : var*4);
	}
	
}//error:-Unexpected type
// a ternary operator cannot be used with the multilayered conditions like 'true==(13!=4)'
// it results in compile error
