class Solution {
    int []arr;
    int []arr1;
    public int largestRectangleArea(int[] h) {
       arr= new int [h.length];
        arr1= new int [h.length];
        int max=0;
        Nser(h);//arr
        Nsel(h);
        for(int i=0;i<h.length;i++){
            int width=arr[i] -arr1[i]-1;
         max= Math.max(h[i]*width,max);
        }
        return max;
    }
void Nser(int h[]){   
    arr[h.length-1]= h.length;
Stack<Integer> st= new Stack<>();
st.push(h.length-1);
for(int i=h.length-2;i>=0;i--){
while(st.size()>0 && h[st.peek()] >= h[i]){
    st.pop();
}arr[i]=st.isEmpty()?h.length:st.peek();
st.push(i);
}
 }
void Nsel(int h[]){
Stack<Integer> st= new Stack<>();
 arr1[0]=-1;
st.push(0);
for(int i=1;i<h.length;i++){
while(st.size()>0 && h[st.peek()] >= h[i]){
    st.pop();
}arr1[i]=st.isEmpty()?-1:st.peek();
st.push(i);
}
   }
}
