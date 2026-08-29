class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls= new ArrayList<>();
         int n=matrix.length;
        int m= matrix[0].length;
        int top=0,btm=n-1,left=0,right=m-1;
        while(top<=btm && left <=right){
        for(int i=left;i<=right;i++){
            ls.add(matrix[top][i]);
        }
        top++;  
          for(int i=top;i<=btm;i++){
            ls.add(matrix[i][right]);
        }
        right--;
        if(top<=btm){
         for(int i=right;i>=left;i--){
            ls.add(matrix[btm][i]);
        }
        btm--;
        }
        if(left<=right){
         for(int i=btm;i>=top;i--){
            ls.add(matrix[i][left]);
        }
        left++;      
        }
        }
        return ls;
    }
}
