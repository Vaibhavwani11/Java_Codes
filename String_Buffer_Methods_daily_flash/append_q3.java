/*Q3. Write a program using StringBuffer to create an object with String "Good" and
  append String "Life" to it. 
Input:
Output:
  Good Good Life */

class appendDemo{

	public static void main(String [] args){
	
		StringBuffer sb1=new StringBuffer("Good");
		
		System.out.println(sb1);	
		System.out.println(sb1.append(" Life"));
	}
}
