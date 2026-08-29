class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       Set<List<Integer>>ans= new HashSet<>();
       List<Integer> ls= new ArrayList<>();
          Arrays.sort(nums);
       f(nums,0,ans,ls);
       
       return new ArrayList<>(ans);
    }
    void f(int []nums, int i,Set<List<Integer>>ans,List<Integer> ls){
        
        if(i==nums.length){
             ans.add(new ArrayList<>(ls));
            return ;
        }
    
            ls.add(nums[i]);
            f(nums,i+1, ans, ls);
            ls.remove(ls.size()-1);
          f(nums,i+1,ans,ls);
        
    }
}
