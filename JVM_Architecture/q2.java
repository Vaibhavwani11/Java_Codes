class IndianArmy{
	static int SoldiersCount=500000;
	int TanksCount=450;

	void ArmyStrength(){
		System.out.println("Soldiers in Indian Army="+SoldiersCount);
		System.out.println("Fighting Tanks="+TanksCount);
	}
}
class IndianNavy{
	static int coastGuards=450000;
	int navyShips=300;
	
	void NavyStrength(){
		System.out.println("Total Coastal Guards="+coastGuards);
		System.out.println("Ships in navy="+navyShips);
	}

}
class IndianAirForce{
	static int airCommando=300000;
	int fighterPlanes=550;

	void secureAirspace(){
		System.out.println("Number of fighter planes="+airCommando);
		System.out.println("Fighter planes="+fighterPlanes);
	}
}
class AttackonChina{
	public static void main(String[] args){
		IndianArmy terrorAttack =new IndianArmy();
		terrorAttack.SoldiersCount=495000;
		terrorAttack.ArmyStrength();

		IndianNavy Vikrant =new IndianNavy();
		Vikrant.navyShips=320;
		Vikrant.NavyStrength();	
	
		IndianAirForce Sukhoi= new IndianAirForce();
		Sukhoi.fighterPlanes=550;
		Sukhoi.secureAirspace();
		
	}
}