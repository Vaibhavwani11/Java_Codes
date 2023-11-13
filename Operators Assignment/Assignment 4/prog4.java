/*Solve the Following Expressions and Write explanation of each operation
along with the order of precedence
*/
class Prog4{
	public static void main(String [] args){
	int a=25,b=-34,c=19,d=4;
	int res=0;
	
	res=((a<<2)| b>>3);	//((25<<2) | -34>>3)
	System.out.println(res);
	}
}//(25*4=100) | (34/8=4)
// 100 | 4
// 0011 0000 | 0000 0010
// 0011 0010
// =102