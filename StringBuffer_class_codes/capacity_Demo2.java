class capacityDemo{

	public static void main(String [] args){
	
		StringBuffer sb1= new StringBuffer("Vaibhav"); //capacity will be 16+7=23 
		
		System.out.println(sb1); 
		System.out.println(sb1.capacity()); //23 (Default capacity+ length of sb1)
		
		 
		sb1.append("Core2Web");
		System.out.println(sb1); 
		System.out.println(sb1.capacity()); //23
		
		sb1.append("Technologies");
		System.out.println(sb1); 
		System.out.println(sb1.capacity()); //{ 23*2+ 2 =48} [New capacity=old capacity*2+2]
		//Because array of 23 characters is filled
	}
}
