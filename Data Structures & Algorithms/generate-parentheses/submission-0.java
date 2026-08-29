class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ls= new ArrayList<>();
        int open=0;
        int close=0;
        StringBuilder ans= new StringBuilder();
        f(n, open,close,ls, ans);
        return ls;
    }
  void  f(int n,int open, int close,List<String>ls,StringBuilder ans){
        if(open==n && close ==n){
            ls.add(ans.toString());
            return ;
        }
        if(open<n){
       ans.append('(');
        f(n,open+1,close,ls,ans );
         ans.deleteCharAt(ans.length()-1);
        }
        if(close<open){ 
              ans.append(')');
              f(n,open,close+1,ls,ans );
               ans.deleteCharAt(ans.length()-1);
        }
        //backtrack
       

    }
}
