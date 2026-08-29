class Solution {
    public List<List<String>> partition(String s) {
     List<List<String>> ans= new ArrayList<>();
     List<String> ls= new ArrayList<>();
       fan(s, 0, ls, ans);
return ans;
     }
    void  fan(String s, int start, List<String> ls, List<List<String>> ans){
        if(start == s.length()){
    ans.add(new ArrayList<>(ls));
    return;
}
for(int end = start; end < s.length(); end++){
if(f(s, start, end)){
    String part = s.substring(start, end + 1);
ls.add(part);

fan(s, end + 1, ls, ans);
ls.remove(ls.size() - 1);
}
}

 }
   boolean f(String s,int i,int j){
    while(i<j){
        if(s.charAt(i)!=s.charAt(j)) return false;
        i++;
        j--;
    }
    return true;

   }

}
