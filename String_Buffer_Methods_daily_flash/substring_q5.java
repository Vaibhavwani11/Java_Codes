/*Q5. Write a program using (d''Aquaman) to delete the substring: ma Aquaman
StringBuffer a
Input: -
Output:
	Aquan
*/
class substring{

	public static void main(String [] args){
	
		StringBuffer sb1=new StringBuffer("Aquaman");
		sb1.delete(4,6);
		System.out.println(sb1);
	}
}
