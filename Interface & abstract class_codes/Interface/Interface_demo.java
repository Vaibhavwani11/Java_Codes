interface RBI{
	
	void loanType();//By default all methods of Interface are Methods are "public abstract"
}
class SBI implements RBI{

	public void loanType(){
	
		System.out.println("Home loan");
	}
}
class AccHolder{

	public static void main(String [] args){
	
		SBI obj=new SBI();
		obj.loanType();
	}
}
