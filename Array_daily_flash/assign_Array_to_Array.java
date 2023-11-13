public class assign_Array_to_Array {
 
    public static void main(String [] args){
        int arr[]={1,2,3,4,5};
        int arr2[]=arr;

        for(int i=0; i<5; i++){
            System.out.println(arr2[i]);
        }
    }
}
