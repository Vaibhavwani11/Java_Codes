class MyException extends Exception{

	String msg;
	
	MyException(String str){
	
		msg=str;
	}
	//Overriding toString() method to print our msg
	public String toString(){
	
		return msg;
	}
}
class ThrowDemo{

	public static void main(String [] args){
	
		try{
			throw new MyException("Apla Exception");
		}
		catch(MyException obj){
		
			System.out.println(obj.toString());
		}
	}}
