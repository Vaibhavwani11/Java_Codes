class DailyFlash{

	public static void main(String [] args){
		DailyFlash obj= new DailyFlash();
		obj.EvenOdd();
	}

	int EvenOdd(){
		int num=11;
		String ans;
	
		ans= (num%2==0)? "Even" : "Odd" ;
		System.out.println(ans);		

	return 0;	
	}
}
