class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> ls= new  ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){ 
            if(i>0 && nums[i]==nums[i-1]){continue;}
            int n1= nums[i];
            sum(-n1,nums,i+1,nums.length-1,ls);
        }
        return ls;
    }
   void sum(int tar,int []nums,int i, int j,List<List<Integer>> ls){
    while(i<j){
        if(nums[i]+nums[j]>tar)j--;
        else if(nums[i]+nums[j]<tar)i++;
        else{
             ls.add( Arrays.asList(-tar,nums[i],nums[j]));
       while(i<j && nums[i]==nums[i+1]){i++;}
       while(i<j && nums[j]==nums[j-1]){j--;}
        i++;
        j--;
      }
    }  
    }
}
