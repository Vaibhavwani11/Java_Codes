class stringBuffer{

	public static void main(String [] args){
	
		StringBuffer sb1= new StringBuffer("Vaibhav"); //only onHeap 
		
		System.out.println(sb1);
		
		StringBuffer sb2= "Vaibhav"; //ERROR 
		
		System.out.println(sb2);
	}
}
