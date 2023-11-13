class Cricket{
	static int NoofPlayers=11;
	int Wickets=5; 
	
	void TeamA(){
		System.out.println("SITS Rockers");
		System.out.println("Wickets Taken="+Wickets);
	}
	void TeamB(){
		System.out.println("11 Hitters");
		System.out.println("Wickets Taken="+Wickets);
	} 
 
	static void summary(){
		System.out.println("Players count in one team="+NoofPlayers);
		System.out.println("Winner=11 Hitters");
	}
}
class Chess{
	static int NoofPlayers=2;
	int Points=15;
	
	void Player1(){
		System.out.println("Vaibhav");
		System.out.println("Vaibhav Points="+Points);
	}
	void Player2(){
		System.out.println("Tushar");
		System.out.println("Tushar Points="+Points);
	} 
	static void summary(){
		System.out.println("Time=30Min.");
		System.out.println("Players count="+NoofPlayers);
	}
}
class Games{
	public static void main(String [] args){
		Cricket object=new Cricket();
		object.TeamA();
		object.TeamB();
		Cricket.summary();
	
		Chess obj =new Chess();
		obj.Player1();
		obj.Player2();
		Chess.summary();

	}
}