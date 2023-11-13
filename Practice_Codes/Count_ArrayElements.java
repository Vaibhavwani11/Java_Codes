package Practice_Codes;

import java.util.*;

public class Count_ArrayElements {
    
    public static void main(String [] a){


        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        int arr[]= {1,2,3,4,5,5,3};
        int arr2[]=new int[10];

        brute_force(arr);

        for(int i: arr){
            System.out.println(i);
        }  
        for (int i : arr) {
        // for(int i=0; i < arr.length; i++ ){

            if(map.containsKey(arr[i])){

                map.put(i , map.get(i) +1 );
            
            }
            else{
                map.put(i, 1);
            }
            i++;
        }  

        System.out.println(map);
        
        //Traverse through map and print the elements
        for(Map.Entry<Integer,Integer> entry: map.entrySet() ){

            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    static void brute_force(int arr[]){

        //This approach will take O(target*N) time complexity.
        //So, for array size of length 10^5, time complexity = 10^5 * 10^5 = 10^10
        //for 10^8 operations it takes 1 second. So, for 10^10 it will take 100 seconds
        //it will exceed the time limit.
        //Hence, Brute force approach is not advisable.

        int target=5;
        int cnt=0;
        for(int i=0; i<arr.length; i++){

            if(arr[i]==target){
                cnt++;
            }
        }
        System.out.println("cnt= "+cnt);
    }
}
