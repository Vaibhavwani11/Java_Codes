/*To calculate substring from given string
ex:- Bielearn
     s1.substring(3) will give string from 3rd index to end of a string
*/
class substringDemo{	

	public static void main(String[] args){
	
		String s1=new String("Bielearn");

		System.out.println(s1.substring(3));  // learn {string from 3 to end}
		System.out.println(s1.substring(0,1));// Biele
	}
}
