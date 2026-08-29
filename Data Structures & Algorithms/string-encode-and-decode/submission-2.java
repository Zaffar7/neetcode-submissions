class Solution {

    public String encode(List<String> strs) {
     StringBuilder sb= new StringBuilder();
     for(int i=0;i<strs.size();i++ ){
        sb.append(strs.get(i).length() +"#"+strs.get(i));
     }
     return sb.toString();
    }

    public List<String> decode(String str) {
List<String> ls= new ArrayList<>();
    for(int i=0;i<str.length();i++){
        int j=i;
        while(str.charAt(j)!='#'){
            j++;
        }
     int len=Integer.parseInt(str.substring(i,j));
     
        ls.add(str.substring(j+1,j+1+len));
       i=j+len;
      
    }
    return ls;
    }
}
