class NumMatrix {
  int [][]mat;
    public NumMatrix(int[][] matrix) {
         mat=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
              mat[i][0] = matrix[i][0]; 
            for(int j=1;j<matrix[0].length;j++){
                mat[i][j]=mat[i][j-1]+matrix[i][j];
            }
        }
        for (int j = 0; j <matrix[0].length; j++) {
            for (int i = 1; i <matrix.length; i++) {
                mat[i][j] = mat[i - 1][j] + mat[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int tot= mat[row2][col2];
        int ext= (row1 !=0 ?mat[row1-1][col2]:0) + (col1 !=0 ?mat[row2][col1-1]:0) -
        ((row1 !=0 && col1 !=0)?mat[row1-1][col1-1]:0);
        return tot- ext;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */