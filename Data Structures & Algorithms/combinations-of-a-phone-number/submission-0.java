class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>ls= new ArrayList<>();

        if (digits.length() == 0) return ls;

        String code[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        f(digits,code,ls,0,"");
        return ls;
    }
  void  f(String digits,String code[],List<String>ls, int i,String curr){
if(i==digits.length()){
    ls.add(curr);
    return ;
}
int a= digits.charAt(i)-48; //23 -abc
String ans=code[a];
for (int j = 0; j < ans.length(); j++) {
f(digits,code,ls,i+1,curr+ans.charAt(j));
}
    }
}
