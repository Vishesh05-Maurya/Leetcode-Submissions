class Solution {
    public int[] sortedSquares(int[] nums) {
        int i =0;
        int j = nums.length-1;
       int   p = nums.length-1;
        int arr[] = new int[nums.length];
        while(i<=j){
            int ss = nums[i]*nums[i];
            int end = nums[j]*nums[j];
             if(ss>end){
            arr[p]=ss;
            i++;
        }else{
            arr[p]=end;
            j--;
        }
        p--;
        }
       
 return arr;
    }
}