class Solution {
    public int bulbSwitch(int n) {
        int count =0;
        int i=1;
        while(i*i<=n){ // the numer of bulb on = number of perfect square number under n.
            count++;
            i++;
        }
        return count;
    }
}