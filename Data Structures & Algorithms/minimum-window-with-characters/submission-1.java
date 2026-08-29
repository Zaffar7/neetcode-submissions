class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        HashMap<Character,Integer>map= new HashMap<>();
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        int j=0;
        int len =Integer.MAX_VALUE;
        int start=-1;
        int cnt= t.length();
        for(int i=0;i<s.length();i++){
           
         if(map.containsKey(s.charAt(i))){
             int f= map.get(s.charAt(i));
         if(f>0){  cnt--;}
           map.put(s.charAt(i),f-1);
           }
         else {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),-1)-1);   //no need char
         }

         while(j<=i && cnt==0){
                if(i-j+1 < len){
        len=i-j+1;
        start=j;
    }if(map.containsKey(s.charAt(j))){
          int freq= map.get(s.charAt(j));
          if(freq==0){
        cnt++;
           map.put(s.charAt(j),1);
         }
         else{
           map.put(s.charAt(j),freq+1);
         }
    }
j++;
        }
        }
        return len==Integer.MAX_VALUE ? "": s.substring(start,start+len);
    }
}
