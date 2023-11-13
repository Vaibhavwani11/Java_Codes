class Unary{
	int a=10,b=20,c=50;
	int ans=--a + ++b +c--;
	
	public static void main(String[] args){
		Unary obj=new Unary();
		System.out.println("Answer="+obj.ans);
		System.out.println("c="+obj.c);
	}
}//9+21+50=80
//c=49