class Solution {
    public int missingNumber(int[] nums) {
     int n  = nums.length;
     //ans  = sum of element (0,n) - sum of array

     int Array_sum  =  0;
     for ( int n1 : nums){
        Array_sum = Array_sum+n1;
     }
    int num_sum  = (n*(n+1))/2;


    return (num_sum-Array_sum);


        
    }
}