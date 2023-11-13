class Relational{
		
 public static void main(String [] args){
		int a=5;
		int b=10;
		boolean ans;
	
		ans= a < b;	//true
		System.out.println(ans);		

		ans= a > b;	//false
		System.out.println(ans);
		
		ans= a <= b;	//true
		System.out.println(ans);
	
		ans= a >= b;	//false
		System.out.println(ans);

		ans= a == b;	//false
		System.out.println(ans);
	
		ans= a != b;	//true
		System.out.println(ans);
	}
}