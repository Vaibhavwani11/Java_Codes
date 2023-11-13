/*To Find last index of a character in a String. 
Ex:- Bielearn. 
	lastIndexOf('e')= 4
	indexOf('e')= 2
*/
class lastIndex{	

	public static void main(String[] args){
	
		String s1=new String("Bielearn");

		System.out.println(s1.lastIndexOf('e'));//4
		System.out.println(s1.lastIndexOf('z'));//-1 is reuturned bcoz 0 index has B 
	}
}
