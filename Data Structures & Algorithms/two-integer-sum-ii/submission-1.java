class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[]= new int[2];
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            map.put(numbers[i],i+1);
        }
     
    for(int i=0;i<numbers.length;i++){
            int t= target- numbers[i];
            if(map.containsKey(t)){
                int r =map.get(t);
                arr[0]=i+1;
                arr[1]=r;
                break;
            }
        }
return arr;}
}
