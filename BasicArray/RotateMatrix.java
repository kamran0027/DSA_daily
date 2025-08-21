public class RotateMatrix {

     public void rotate(int[][] mat) {
        int[][] ans=new int[mat.length][mat[0].length];
        int n=mat.length-1;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                ans[j][n-i]=mat[i][j];
            }
        }
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                mat[i][j]=ans[i][j];
            }
        }

    }
}
