class ifElse{
	public static void main(String [] args){
		
		ifElse obj=new ifElse();
		obj.Vowels();
	}
		
	void Vowels(){
		char ch='A';
	
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
			
			System.out.println(" is a Vowel"+ch);
		}
		else{
			System.out.println("is a Consonant"+ch);
		}
	}
	
}