class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ls= new ArrayList<>();
        HashMap<String, List<String>>map= new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
         char[] chars = strs[i].toCharArray();
         Arrays.sort(chars);
         String sorted = new String(chars);
         if(map.containsKey(sorted)){
            map.get(sorted).add(s);
         }else{
             List<String> temp = new ArrayList<>();
                temp.add(s);
            map.put(sorted,temp);
         }
        }
        return new ArrayList<>(map.values());
    }
}
