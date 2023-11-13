/*Write a Java program to find the number occuring odd number of times in an array. the array as input from user.
Example:
	Input: {1,2,3,2,3,1,3}
	Output: 3
	Note: Take size of array and numbers from user*/
class oddNum{

	public static void main(String [] args){
		
		int arr[]={1,2,3,1};
		int cnt=0;
		for(int i=0; i<arr.length; i++){
			
			if(arr[i]%2!= 0){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
