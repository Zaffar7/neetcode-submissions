class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ls= new ArrayList<>();
        Arrays.sort(nums);
         for(int i=0;i<nums.length-3;i++){
             // skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j=i+1;j<nums.length-2;){
               int p= j+1;
               int q=nums.length-1;
               while(p<q){
               long t= (long)nums[i]+nums[j]+nums[p]+nums[q];
                if(t>target)q--;
                else if(t<target)p++;
                else{
               ls.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[p], nums[q])));
                p++;q--;
                while (p < q && nums[p] == nums[p - 1]) p++;
               while (p < q && nums[q] == nums[q + 1]) q--;
               }
               }
               j++;
               while(j<nums.length && nums[j]==nums[j-1])j++;
            }
         }
         return ls;
         }
    }
