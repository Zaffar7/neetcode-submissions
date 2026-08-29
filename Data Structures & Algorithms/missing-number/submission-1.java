class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length+1;i++)
          set.add(i);
       for(int i=0;i<nums.length;i++){
        if(set.contains(nums[i])) set.remove(nums[i]);
       }
       return set.iterator().next();
    }
}
