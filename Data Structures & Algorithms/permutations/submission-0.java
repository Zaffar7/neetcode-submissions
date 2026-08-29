class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans= new ArrayList<>();
        List<Integer> ls= new ArrayList<>();
        f(nums,ans,ls);
        return ans;
    }
    void f(int []nums, List<List<Integer>>ans,List<Integer> ls){
        
        if(ls.size()==nums.length){
             ans.add(new ArrayList<>(ls));
            return ;
        }
       for (int i = 0; i < nums.length; i++) {
            if (ls.contains(nums[i]))
                continue;

            ls.add(nums[i]);
            f(nums, ans, ls);
            ls.remove(ls.size() - 1);
        }
    }
}
