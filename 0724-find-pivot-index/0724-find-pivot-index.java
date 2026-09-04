class Solution {
    public int pivotIndex(int[] nums) {

        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int leftsum=0;
        int rightsum=0;
       for(int i=0;i<n;i++){
        leftsum += nums[i];
        left[i] = leftsum;
       }
     for(int  j=n-1;j>=0;j--){
        rightsum += nums[j];
        right[j] = rightsum;
     }
     for(int i=0;i<n;i++){
        if(left[i]==right[i]){
            return i;
        }
     }
return -1;
        
    }
}