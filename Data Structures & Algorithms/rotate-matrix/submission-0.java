class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        r2c(matrix,m,n);
        reverse(matrix,m,n);
    }
    void r2c(int [][]mat,int m,int n){
for(int i=0;i<m;i++){
    for(int j=0;j<i;j++){
        int temp= mat[i][j];
        mat[i][j]=mat[j][i];
        mat[j][i]=temp;
    }
}
    }
    void reverse(int [][]mat,int m,int n){
        for(int i=0;i<m;i++){
            int j=0;
            int k=m-1;
            while(j<k){
int temp= mat[i][j];
        mat[i][j]=mat[i][k];
        mat[i][k]=temp;
               j++;k--;
            }
        }
    }
}
