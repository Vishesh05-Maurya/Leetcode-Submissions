class Solution {
    public int dominantIndex(int[] nums) {
        int largest= -1;
        int sc = -1;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                sc = largest;
                largest = nums[i];
                index=i;
            }else if (nums[i]>sc &&nums[i]<largest){
                sc=nums[i];
            }
        }
        if(sc*2<=largest){
            return index;
        }
        return -1;
    }
}