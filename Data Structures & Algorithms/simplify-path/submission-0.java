class Solution {
    public String simplifyPath(String path) {
     Stack<String> st= new Stack<>();
     String[]arr=path.split("/");
     for(int i=0;i<arr.length;i++){
      if(arr[i].equals("..") && !st.isEmpty())
      st.pop();
      else if(arr[i].equals(".")||arr[i].equals("") || arr[i].equals("..")) continue;
      else st.push(arr[i]);
     }   
     StringBuilder sb= new StringBuilder();
     for(String i:st){
     sb.append("/");
     sb.append(i);
     }
return sb.length()==0?"/":sb.toString();
    }
}