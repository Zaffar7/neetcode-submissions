class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
      List<Integer>ls=new ArrayList<>();
      int l=0;
      int h=arr.length-1;
      int mid=0;
      while(l<=h){
        mid=(l+h)/2;
       // if(arr[mid]==x)break;
         if(arr[mid]<x)l=mid+1;
        else h=mid-1;
      }  
     // l=mid-1;
    // h=mid;
     h = l;
       l = l - 1;
     
      while(l>=0 && h<=arr.length-1 &&k>0){
        if(Math.abs(arr[l]-x)<=Math.abs(arr[h]-x)){
            ls.add(arr[l]);l--;
        }else{
            ls.add(arr[h]);
            h++;
        }
        k--;
      }
      while( l>=0 && k-->0){
        ls.add(arr[l]);
        l--;
      }
      while( h<arr.length && k-->0 ){
        ls.add(arr[h]);
        h++;
      }
      Collections.sort(ls);
      return ls;
    }
}