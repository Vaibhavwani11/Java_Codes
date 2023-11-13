/*Write a Java program to take an array of String as input from user and print the following pattern from those characters.
 Example Input: ("I","am","Indian") 
	 Output: I	
		 Am Am
		 Indian Indian Indian*/
class stringArr{

	public static void main(String [] args){
	
		String arr[]={"i","Am","Vaibhav"};

		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<i+1; j++){
				
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
}
