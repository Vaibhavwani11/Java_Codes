
class Sum{

    static int cnt=0;

    public static void main(String[] args) {
        
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9};

        int sum=6;

        System.out.println("Subsets are: ");
        findSubsets(arr,sum);
        System.out.println("Total count= "+cnt);
    }
    static void findSubsets(int arr[],int target){

        System.out.println("Target sum= "+target);

        //to check for each pair
        for (int i = 0; i < arr.length-1; i++) {

            int Sum=0;
            for (int j = i+1; j < arr.length; j++) {
                Sum=arr[i] + arr[j];
                if(Sum==target){
                    System.out.println(arr[i]+" "+arr[j]);
                    cnt++;
                }
            }
        }
        //to calculate adjacent sum
        //for (int i = 0; i < arr.length; i++) {
        int i1=0;
        while(i1<arr.length){

            int j=i1;
            int add=0;            
            //for (int j = 0; j < arr.length; j++) {
            while(j<arr.length){  
                add=add+arr[j];
                if(add==target){
                    System.out.println(arr[i1]+" "+arr[j]);
                    cnt++; 
                    i1++;
                    break;
                }
                else if(add<target){
                    j++;
                    if(j==arr.length){
                        i1++;
                        break;
                    }
                }
                else{
                    i1++;
                    j++;
                }
            }
        }

        //to find pairs of 3
        for (int i = 0; i < arr.length-2; i++) {
            
            for (int j = i+1; j < arr.length-1; j++) {
                
                int sum2=arr[i]+arr[j];
                int sum=0;
                for (int k = j+1;  k < arr.length; k++) {
                    sum= sum2+arr[k];
                    if(sum==target){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        cnt++;
                        break;
                    }
                }
            }
        }
    }
}