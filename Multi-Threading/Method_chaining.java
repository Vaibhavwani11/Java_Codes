class IPL{

	IPL pName(){
	
		IPL i = new IPL();
		System.out.println("Rohit Sharma");
		return i;
	}
	int pRuns(){
	
		System.out.println("Total Runs: ");
	return 200;
	}
	
}
class Match{

	public static void main(String [] args){
	
		//new IPL().pName().pRuns();
		
		System.out.println(new IPL().pName().pRuns());
	}
}
