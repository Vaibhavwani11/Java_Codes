class Opr{
	int a=10,b=20,c=50;
	int ans=a++ + --b +c--;
	
	public static void main(String [] args){
		Opr obj= new Opr();
		System.out.println("Answer="+obj.ans);
	}
}// 10+19+50=79