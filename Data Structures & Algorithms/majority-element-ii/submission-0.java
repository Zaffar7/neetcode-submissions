class Solution {
    public List<Integer> majorityElement(int[] nums) {
    int cnt =(int)nums.length/3;
      List<Integer> ans=new ArrayList<>();
      HashMap<Integer,Integer>map= new HashMap<>();
      for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }
      for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
        int k=entry.getKey();
    int f = entry.getValue();
     if(f>cnt)ans.add(k);
}
return ans;    
    }
}