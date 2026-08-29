class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
       // for(String i:strs)System.out.print(i);
        String s1= strs[0];
        String last= strs[strs.length-1];
        int idx=0;
        while(idx<s1.length()){
            if(s1.charAt(idx)==last.charAt(idx))idx++;
            else break;
        }
        return idx==0?"":s1.substring(0,idx);
    }
}