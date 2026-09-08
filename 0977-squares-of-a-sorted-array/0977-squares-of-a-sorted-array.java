class Solution {
    public int[] sortedSquares(int[] nums) {
        int i =0;
        int j = nums.length-1;
       int   p = nums.length-1;
        int arr[] = new int[nums.length];
        while(i<=j){
             if(Math.abs(nums[i])>Math.abs(nums[j])){
            arr[p]=nums[i]*nums[i];
            i++;
        }else{
            arr[p]=nums[j]*nums[j];
            j--;
            
        }
       p--;
        }
       
 return arr;
    }
}