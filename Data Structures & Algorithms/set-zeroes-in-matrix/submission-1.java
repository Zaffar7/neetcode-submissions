class Solution {
    public void setZeroes(int[][] matrix) {
         boolean rowZero = false; //0
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                   matrix[0][j]=0; //zero row
                   if(i>0)matrix[i][0]=0; //zero col
                   else rowZero=true;
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
               if(matrix[0][j] == 0 || matrix[i][0] == 0) {
                   matrix[i][j]=0;
                }
            }
        }
    
    if(matrix[0][0]==0){
        for(int i=0;i<matrix.length;i++){
            matrix[i][0]=0;
        }
    }
   if (rowZero) {
            for (int c = 0; c < matrix[0].length; c++) {
                matrix[0][c] = 0;
            }
   } 
    }   
}
