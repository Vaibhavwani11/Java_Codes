class IPLPlayer{

	String pName= "KL Rahul"; //instance variable
	int runs2020= 534;	  //instance variable
	static int totalRuns= 5230;//static variable

static void playerInfo(){

//instance variable & static variables can be called directly from Instance Method.	
	System.out.println("Player Name= "+pName);     
	System.out.println("IPL 2020 Runs= "+runs2020);
	System.out.println("Player Name= "+totalRuns);

}
public static void main(String [] args){

	IPLPlayer ipl2020= new IPLPlayer();
	ipl2020.playerInfo();
		
	//static variables can be called directly from static Method 
	System.out.println("\nPlayer Name= "+ipl2020.pName);  	//object.variable
	System.out.println("IPL 2020 Runs= "+ipl2020.runs2020);
	System.out.println("Player Name= "+totalRuns);		//static variable can be called directly

}

}
