class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ls= new ArrayList<>();
        f(1,n,k,ls,ans);
 return ans;
    }
    void f(int i, int n,int k,List<Integer> ls,List<List<Integer>> ans){
        if(i>n){
            if(ls.size()==k)ans.add(new ArrayList<>(ls));
            return ;
        }
        ls.add(i);
     f(i+1,n,k,ls,ans);
     ls.remove(ls.size()-1);
     f(i+1,n,k,ls,ans);

    }
}