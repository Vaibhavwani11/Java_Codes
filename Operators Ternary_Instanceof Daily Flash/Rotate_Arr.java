class Solution {
 
       	public static void rotate(int[] nums, int k) {
    	// speed up the rotation
   	 k %= nums.length;
   	 int temp, previous;
   
   	for (int i = 0; i < k; i++) {
   	   
	    previous = nums[nums.length - 1];
  	    
	    for (int j = 0; j < nums.length; j++) {
  
      		   temp = nums[j];
     		   nums[j] = previous;
     		   previous = temp;
     	    }
    	}
	for(int i=0; i<nums.length; i++){
	
		System.out.println(nums[i]);
	}
  	}
	public static void main(String [] args){
	
		int arr[]=new int[]{1,2,3,4,5};

		rotate( arr, 2);
	}
}
