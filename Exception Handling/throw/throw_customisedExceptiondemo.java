class MyException extends Exception{

}
class ThrowDemo{

	public static void main(String [] args) throws MyException{
	
		MyException me=new MyException();

	//	throw new MyException();
		throw me;
	}
}
