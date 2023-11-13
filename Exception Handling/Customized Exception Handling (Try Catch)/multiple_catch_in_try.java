class MultipleCatch{

	public static void main(String [] args){
	
		MultipleCatch obj=null;//new MultipleCatch();

		System.out.println("Statement 1");
		try{
		
			System.out.println(10/0); 
			obj.fun();
		}
		catch(Exception ae){
			
			System.out.println("ArithmeticException handled");
		}
		catch(Exception ne){
		
			System.out.println("NullPointerException handled");
		}
	}
	void fun(){
	
		System.out.println("In fun");
	}
}/*
1.he right ahe :)-
catch(ArithmeticException ){

}
catch(Exception ){

}

2.he chalat nahi :)-
catch(Exception ){

}
catch(ArithmeticException ){

}

3.he pn chalat nahi :)-
catch(ArithmeticException ){

}
catch(ArithmeticException ){

}

*/
