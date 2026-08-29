class Solution {
    public int longestConsecutive(int[] nums) {
         int len=0;
        HashMap<Integer,Boolean>map=new HashMap<>();
        //step1- putinmap
        for(int i=0;i<nums.length;i++){
         map.put(nums[i],true);
        }
        //checksp
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]-1)==true)
            map.put(nums[i],false);
        }
        //findlength forevery sp
      /*  for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==true){
                int curr=1;
                int val=nums[i];
                while(map.containsKey(val+1)==true){
                    curr++; val++;
                }
                len=Math.max(len,curr);
            }
        }*/
         for(int key: map.keySet()){
            if(map.get(key)){
                int curr=0;
                while(map.containsKey(key)==true){
                    curr++; key++;
                }
                len=Math.max(len,curr);
            }
        }
        return len;
    }
}
