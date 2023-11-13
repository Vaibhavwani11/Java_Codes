class Solution{
    public void  MakeZeros(int[][] zarr)
    {
        // code here
        int m=zarr.length,n=zarr.length;
        int arr[][]=new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j]=zarr[i][j]; 
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (arr[i][j] == 0) {
                   // System.out.println(i+" "+j);
                    if (i == 0) {
                        if (j == 0){
                            zarr[i][j + 1] = zarr[i + 1][j] = 0;
                            zarr[i][j]=arr[i][j+1]+arr[i+1][j];
                        }
                        else if (j == (n-1)){
                            zarr[i][j - 1] = zarr[i + 1][j] = 0;
                            zarr[i][j]=arr[i][j-1]+arr[i+1][j];
                        }
                        else{
                            zarr[i][j + 1] = zarr[i + 1][j] = zarr[i][j - 1] = 0;
                            zarr[i][j]=arr[i][j+1]+arr[i][j-1]+arr[i+1][j];
                        } 
                    }
                    else if (i == (m-1)) {
                        if (j == 0){
                            zarr[i][j + 1] = zarr[i - 1][j] = 0;
                            zarr[i][j]=arr[i][j+1]+arr[i-1][j];
                        }
                        else if (j == (n-1)){
                            zarr[i][j - 1] = zarr[i - 1][j] = 0;
                            zarr[i][j]=arr[i][j-1]+arr[i-1][j];
                        }
                        else{
                            zarr[i][j + 1] = zarr[i][j - 1] = zarr[i - 1][j] = 0;
                            zarr[i][j]=arr[i][j+1]+arr[i][j-1]+arr[i-1][j];
                        }
                    }
                    else {
                        if (j == 0){
                            zarr[i][j + 1] = zarr[i + 1][j]=zarr[i-1][j] = 0;
                            zarr[i][j]=arr[i][j+1]+arr[i+1][j]+arr[i-1][j];
                        }
                        else if (j == (n-1)){
                            zarr[i][j - 1] = zarr[i + 1][j]=zarr[i-1][j] = 0;
                            zarr[i][j]=arr[i][j-1]+arr[i+1][j]+arr[i-1][j];
                        }
                        else{
                            zarr[i][j + 1] = zarr[i + 1][j] = zarr[i][j - 1]=zarr[i-1][j]= 0;
                            zarr[i][j]=arr[i][j+1]+arr[i][j-1]+arr[i+1][j]+arr[i-1][j];
                        }
                    }
                }
            }
        }
    }
    }
