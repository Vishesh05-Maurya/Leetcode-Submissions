class Solution {
    public void sortColors(int[] nums) {
         int left=0;
       
    int right=nums.length-1;
  while(left<=right){

// in the first step we move all zero in the left most 
 if(nums[left]==0){
    left++;
 }else if(nums[left]!=0 && nums[right]==0){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        left++;
        right--;
        
 }else{
    right--;
 }
}
 // [0,0,1,2,1];
// in second step - now zero are in the left mose place 
// after zero if we got 2 in left and 1 in right we swap it a
int end=nums.length-1;
int start=left;
while(start<end){
if(nums[start]==1){
    start++;
}else if(nums[start]==2 && nums[end]==1){
    int temp=nums[start];
    nums[start]=nums[end];
    nums[end]=temp;
    start++;
    end--;
}
else
    end--;
  }

        
    }
}