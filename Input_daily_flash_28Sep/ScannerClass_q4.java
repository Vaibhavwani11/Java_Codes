/*Take input from user using scanner class to print account id.
Input:
	Enter string ID : Michelle 
	Enter numerical ID:1234 
	Your email id is : Michelle1234@gmail.com
*/
import java.util.*;
class Id{

	public static void main(String [] args){
	
		Scanner vv=new Scanner(System.in);

		System.out.println("Enter id & numId: ");
		String id= vv.next();
		int numID= vv.nextInt();

		System.out.println(id+numID+"@gmail.com");
	}
}
