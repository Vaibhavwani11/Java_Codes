import java.util.*;
/*
4

1          =1
2 3         =2
4 5 6         =3  
7 8 9 10    =4  4
7 8 9 10    =5
4 5 6       =6
2 3         =7
1           =8
 */
// class eQTech_multiple__patterns {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();

//         //upper pattern
//         int k=1;
//         for (int i = 1; i <=num; i++) {
            
//             for (int j = 1; j <= i; j++) {
                
//                 System.out.print(k);
				
// 				if(j<i){
// 					System.out.print("*");
// 				}
//                 k++;
//             }
//             System.out.println();
//         }
//         //lower pattern
//         for (int i = num; i >= 1; i--) {
//             k=k-num+1;
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(k+" ");
//                 k++;
//             }
//             System.out.println();
//         }
//     }
// }
import java.util.*;

class Main{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	int a=1;

	//upper pattern
	for(int i=0;i<num;i++){

	    for(int j =0;j<=i;j++){
            
	        System.out.print(a);
	        if(j<i){
	            System.out.print("*");
	        }
	        a++;
	    }System.out.println();
	}
	//lower pattern
	a=11;
	for(int i=num;i>=1;i--){

		a=a-i;

	    for(int j=1; j<=i; j++){

	        System.out.print(a);
	        
	        if(j==i){
	           // System.out.print("cnt");
	            continue;
	        }
		   else{
	            System.out.print("*");
			}
			a++;
	    }
	    System.out.println();
	    a=a-i+1;

	}
}
}
int isHeatWave(int arr[])
{   int cnt=0; 
	int cnt2=0; 
	for(int i=0; i<arr.lenghth; i++){
		      if(arr[i]>25) {
				cnt++;
			}    
			if(arr[i]>30){
				 cnt2++;
			} 
			if(cnt2>=3){ 
				return cnt;
			}
			 else{
				return 0;
			}
	}
}