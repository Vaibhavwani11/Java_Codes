/*Q1. Write a program using StringBuffer to show the difference between the following methods:
 length() and capacity() for 2 objects:
 1. Created using default constructor
 2. Created using parameterized constructor (java.lang.String) âM (âlCore2Webâ'K)
Input: -
Output:
	Sb1 length is 0
	Sb1 capacity is 16 Sb2 length is 8
	Sb2 capacity is 24 */
class capacity{

	public static void main(String [] args){
	
		String s1=new String("Vaibhav");
		System.out.println(s1.length());
		
		StringBuffer sb1=new StringBuffer("Wani");
		System.out.println(sb1.capacity());
	}
}

