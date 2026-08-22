class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
    System.arraycopy(nums1, 0, result, 0, nums1.length);
    System.arraycopy(nums2, 0, result, nums1.length, nums2.length);
    Arrays.sort(result);
    int len = result.length;
  
    if(len%2!=0){
       
      return result[len/2];
    }
    else{
        float min = result[(len-1)/2];
        float max =result[len/2];
        float med = (min+max)/2;
      return med;

    }
    
}
}