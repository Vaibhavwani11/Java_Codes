//capacity() acts as x.length() on StringBuffer 
class capacityDemo{

	public static void main(String [] args){
	
		
		StringBuffer sb= new StringBuffer(); 
		
		System.out.println(sb); 
		System.out.println(sb.capacity()); //16 (Default capacity)
		
		sb.append("Core2Web");
		System.out.println(sb.capacity()); //16
		
		sb.append("Technologies");
		System.out.println(sb.capacity()); //34 {New capacity=old capacity*2+2}(
		//(16*2 +2) =34 
		//Because array of 16 characters is not enough
	}
}
