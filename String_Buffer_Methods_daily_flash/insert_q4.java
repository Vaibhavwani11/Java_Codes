/*Q4. Write a program using StringBuffer Healthy for the following methods:
 *insert(int,String) to insert: a space at 4th index and a self at 8th index and 
* deletecharAt() to delete character at 4th index.
Input:
Output:
	Healthy
	Heal thy
	Heal thyself 
	Healthyself*/
class insertDemo{

	public static void main(String [] args){
	
		StringBuffer sb1=new StringBuffer("Healthy");
	//insert
		sb1.insert(4," ");
		System.out.println(sb1);

		sb1.insert(8,"self");
		System.out.println(sb1);
	//deletecharAt()
		sb1.deleteCharAt(4);
		System.out.println(sb1);

	}
}
