//one gets 'Object' as arguement & returns var1+10
//second one takes arguement as 'Core2web object' and returns var1+1
class Core2web{

/*'This is valid'
	Object obj=10;
	Core2web c2w=new Core2web();
	Core2web o=c2w;
*/
	int var1;
	Core2web(){
	
		var1=10;
	}	
	int getVar1(Core2web obj){
	
		return ++var1;
	}
	int getVar1(Object obj){

		return var1+10;
	}
	public static void main(String [] args){
	
		Core2web c2w=new Core2web();
		
		System.out.println(c2w.getVar1(10));
		System.out.println(c2w.getVar1(c2w));
	}
}
