#include <stdio.h>

int main(void) {
	// your code goes here
    int n;
    scanf("%d",&n);
    
    int mat[n][5];
    int num=1;
    
    for(int i=0; i<n; i++){
        
        if(i%2==0){
            
            for(int j=0; j<5; j++){
            
                mat[i][j]=num;
                num++;
                //printf("");
            }
        }
        else{
            
            for(int j=4; j>=0; j--){
                
                mat[i][j]=num;
                num++;
                //printf("%d ",num);
            }
        }
    } 
    //for printing matrix
    for(int rows=0; rows<n; rows++){
        for(int cols=0; cols<5; cols++){
            
            printf("%d ",mat[rows][cols]);
        }
        printf("\n");
    }
	return 0;
}


