class Solution {
    public int[] sortArray(int[] nums) {
      int []ans= new int[nums.length];
      HashMap<Integer,Integer> map= new HashMap<>();
      int min= Integer.MAX_VALUE;
      int max= Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        if(min>nums[i]) min=nums[i];
        if(max<nums[i])  max=nums[i];
      }
      int idx=0;
      for(int i=min;i<=max;i++){
        if(map.containsKey(i)){
            int freq= map.get(i);
            while(freq--!=0){
           ans[idx++]=i;
            }
        }
      }
      return ans;

    }
}