
class className{

	public static void main(String [] args){
	
		//Every array is a object array in java
		//So, it gets space on Heap
		int arr[]={10,20,30,40,50};
		int varr[]=new int[5];

		for(int i=0; i<5; i++){
		
			System.out.println(arr[i]);
		}
		
		System.out.println(arr.getClass());
		System.out.println(varr.getClass());
		//class [I 
		//This is Runtime Signature
		//for Float Runtime Signature is class [F
	}
}
