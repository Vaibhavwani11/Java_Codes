class Logical{
	public static void main(String [] args){
		int i=5;
		int j=4;
		boolean ans;
		
		ans= (i++ >= j++) && (--j < i++);	//(5>=4) &&(4<6) = (T) && (T)=T
		System.out.println(ans);
		System.out.println(i);		//i=7
		System.out.println(j);		//j=4
	
		ans= (--i < j--) || (j++ >= ++i);		//(6<4) || (3>=7) =(F) || (F)= F	
		System.out.println(ans);	
		System.out.println(i);		//i=7
		System.out.println(j);		//j=4
	
	}
}

