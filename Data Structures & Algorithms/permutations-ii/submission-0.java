class Solution {
    
    public List<List<Integer>> permuteUnique(int[] nums) {
       List<List<Integer>>ans=new ArrayList<>();
       boolean[]  visit = new boolean[nums.length];
        Arrays.sort(nums);
       List<Integer>ls= new ArrayList<>();
       f(nums,ans,ls,visit);
       return ans; 
    }
    void f(int []nums,List<List<Integer>>ans,List<Integer>ls,boolean[] visit){
        if(ls.size()==nums.length){
          ans.add(new ArrayList<>(ls));
          return ;
        }
  for(int i=0;i<nums.length;i++){
    if(visit[i]|| (i>0 && nums[i]==nums[i-1]&& !visit[i-1])) continue;
    visit[i]=true;
     ls.add(nums[i]);
     f(nums,ans,ls,visit);
     visit[i]=false;
     ls.remove(ls.size()-1);
  }

    }
}