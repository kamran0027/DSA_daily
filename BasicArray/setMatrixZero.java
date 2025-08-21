public class setMatrixZero {
    //first approach    
    public void setZeroes(int[][] matrix) {
        int n=matrix[0].length;
        int m=matrix.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    markedRowNeg(matrix,i,n);
                    markedColNeg(matrix,j,m);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
        
    }

    public static void markedRowNeg(int [] [] a, int i,int n){
        for(int j=0;j<n;j++){
            if(a[i][j]!=0){
                a[i][j]=-1;
            }
             
        }
    }
    public static void markedColNeg(int [] [] a, int j,int m){
        for(int i=0;i<m;i++){
           if(a[i][j]!=0){
                a[i][j]=-1;
            }
        }
    }

    //better approachh
   
    
}
