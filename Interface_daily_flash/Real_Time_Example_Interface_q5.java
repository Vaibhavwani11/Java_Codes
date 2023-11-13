/*5. Write a java program having two interfaces each having at least two abstract methods,
then one class implementing those two interfaces. (Use real-time examples.)*/

interface Constitution{

	abstract void PM_duties();

}
interface PMOffice extends Constitution{

	abstract void PM_duties();

}
class PM implements PMOffice{

	public void PM_duties(){
	
		System.out.println("Completed Successfully by PM_Modi!");
	}
}
class Citizens{

	public static void main(String [] args){
	
		Constitution ind=new PM();
		ind.PM_duties();
	}
}
