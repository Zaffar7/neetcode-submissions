class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>ls= new ArrayList<>();
        return f(nums,0,ls,ans);
        
    }
    List<List<Integer>> f(int nums[],int i,List<Integer> ls,List<List<Integer>>ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(ls));
            return ans;
        }
        ls.add(nums[i]);
        f(nums,i+1,ls,ans);
        ls.remove(ls.size()-1);
        f(nums,i+1,ls,ans);
        return ans;
    }
}
