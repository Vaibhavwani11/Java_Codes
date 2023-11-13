class Human{
	public static void main(String [] args){

		Human lion=null;	//No object is created
		Human tiger =null;	//No object is created
		Human puma=null;	//No object is created
		Human monkey=new Human();	// Object monkey is created here
		
		boolean isLionHuman=lion instanceof Human;	
		System.out.println("Are Lion and Human of same Species -->"+isLionHuman);	//false

		boolean isTigerHuman=tiger instanceof Human;		
		System.out.println("Are Tiger and Human of same Species -->"+isTigerHuman);	//false

		boolean isPumaHuman=puma instanceof Human;		
		System.out.println("Are Puma and Human of same Species -->"+isPumaHuman);	//false

		boolean isMonkeyHuman=monkey instanceof Human;
		System.out.println("Are Monkey and Human of same Species -->"+isMonkeyHuman);  //true



	}
}