class Solution {
    public int maxProduct(int[] nums) {
        int largest = -1;
        int s_largest = -1;
        for( int n : nums){
            if(n>largest){
                s_largest = largest;
                largest = n;
            }
          else if( n > s_largest && n <=largest){
            s_largest = n;
          }
        }

        return ((largest-1)*(s_largest-1));

    }
}