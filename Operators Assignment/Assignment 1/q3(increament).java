class Increament{
	int a=10,b=20,c=50;
	int ans=a++ + ++b + ++c;
	
	public static void main(String[] args){
		Increament obj=new Increament();
		System.out.println("Answer="+obj.ans);
	}
}//10+21+51=82