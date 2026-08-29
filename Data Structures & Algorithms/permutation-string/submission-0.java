class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int cnt=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
         map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        int l=0;
      for(int r=0;r<s2.length();r++){
        
        if(map.containsKey(s2.charAt(r))){
             if (map.get(s2.charAt(r)) > 0) cnt++;
           map.put(s2.charAt(r), map.get(s2.charAt(r)) - 1); 
           
        }
            //we have add again those character remove
          if (r - l + 1 > s1.length()) {
                char left = s2.charAt(l);

                if (map.containsKey(left)) {
                    if (map.get(left) >= 0)
                        cnt--;

                    map.put(left, map.get(left) + 1);
                }
                l++;
            }
            if(cnt==s1.length()) return true;
        
        // map.put(s2.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }  
return false;
    }
}
