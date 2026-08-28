class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total_water = numBottles;
        
        while(numBottles>=numExchange){
        int new_bottle = numBottles /numExchange;
        int rem  = total_water % numExchange;
        total_water += new_bottle;
        numBottles = rem+new_bottle;
         }
 return total_water;
        
    }
}