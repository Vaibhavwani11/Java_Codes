/*3.Write a java program interface HealthMinsitryNorms then interface ICMRGuidlines extending the previous one and then class State implementing ICMRguidlines.*/
interface HealthMinistryNorms{

	void lockdown_decision();
}
interface ICMRGuides extends HealthMinistryNorms{

	void lockdown_decision();
}
class State implements ICMRGuides{
	
	public void lockdown_decision(){
		
		System.out.println("Lokdown for 15 days");
	}
}
class Peoples{

	public static void main(String [] args){
	
		HealthMinistryNorms c=new State();
		c.lockdown_decision();
		
		State c1=new State();
		c1.lockdown_decision();
	}

}
