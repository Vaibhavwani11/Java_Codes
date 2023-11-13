class Angle{
	public static void main(String [] args){
		
	Angle obj = new Angle();
	obj.AcuteObtuse(); 
			
	}
	
	void AcuteObtuse(){
		
		float angle=91.25f;
		String result=null;	
			
		result= (angle<90)? "Acute angle" : "Obtuse angle";
		System.out.println(result);
		
	}
}