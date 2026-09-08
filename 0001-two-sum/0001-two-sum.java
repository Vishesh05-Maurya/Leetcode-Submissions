class Solution {
    public int[] twoSum(int[] nums, int target) {
          int[] ind = new int[2];
          int n = nums.length;
     for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(nums[i]+nums[j]==target){
                ind[0]=i;
                ind[1]=j;

            }
        }
     }
 
      return ind;
    }
}