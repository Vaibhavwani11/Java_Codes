class coronaMaha{
	int count=170000;	

	void precautions(){
		System.out.println("Kalji Ghya");
		System.out.println("count=" +count);	
	}
	
	static void impDecision(){
		System.out.println("CM's Decision");
	}
	
	public static void main(String [] args){
		coronaMaha June28 =new coronaMaha();
		June28.precautions();
		
		coronaMaha June29=new coronaMaha();
		June29.count=175000;
		June29.precautions();
	}
}