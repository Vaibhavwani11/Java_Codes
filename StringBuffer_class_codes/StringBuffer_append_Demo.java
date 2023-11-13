//String Buffer is mutable
class appendDemo{

	public static void main(String [] args){
	
		
		StringBuffer sb= new StringBuffer(); 
		
		StringBuffer sb1= new StringBuffer("Vaibhav"); //only onHeap 
		
		StringBuffer sb2= new StringBuffer("Wani"); // 
		
		System.out.println(sb); //
		System.out.println(sb1); //Vaibhav
		System.out.println(sb2); //Wani
		
		System.out.println(sb1.append(sb2)); //VaibhavWani
		System.out.println(sb.append("Core2Web")); //Core2Web
	}
}
