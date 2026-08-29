class Solution {
    public boolean isAnagram(String s, String t) {
   HashMap<Character,Integer> map= new HashMap<>();
   for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
      }
      for(int i=0;i<t.length();i++){
        if(map.containsKey(t.charAt(i))){
            int freq= map.get(t.charAt(i));
            if(freq>1) map.put(t.charAt(i),freq-1);
            else map.remove(t.charAt(i));
        }
        else return false;
      }
      return map.size()>0?false:true;
    }
}
