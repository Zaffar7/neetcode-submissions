class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int maxi=0;
        int maxFreq=0;
          HashMap<Character, Integer> map = new HashMap<>();
        for(int r=0;r<s.length();r++){
           map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
             maxFreq = Math.max(maxFreq, map.get(s.charAt(r)));
          if((r-l+1)- maxFreq<=k)  
            maxi= Math.max(maxi,r-l+1);
            else{
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
l++;
            } //decrement frequency increase l pointer
        }
        return maxi;
    }
}
