class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     int arr[]= new int[nums1.length -n];
     for(int i=0;i<arr.length;i++){
        arr[i]=nums1[i];
     }
    int i=0,j=0,idx=0;
    while(i<arr.length && j< nums2.length){
          if(arr[i]>=nums2[j]){
                nums1[idx++]=nums2[j++];
            }else{nums1[idx++]=arr[i++];
            }
        }
        if(i<m){
            while(i<m){
                nums1[idx++]=arr[i++];
            }
        }
          if(j<n){
            while(j<n){
                nums1[idx++]=nums2[j++];
            }
        }
    }
}