/*Q2. Write a program using StringBuffer for the following methods: 
 charAt(int) to find character at 5th index and
 indexOf(String) to find index of â char from the String.
 Input: 
 Output:
    The character at index 5 is:- t The index of "c" is 2 */
class BufferMethods{

	public static void main(String [] args){
	
		StringBuffer sb1=new StringBuffer("Core2Web");
		
		System.out.println(sb1.charAt(5));
		System.out.println(sb1.indexOf("e"));

	}
}
