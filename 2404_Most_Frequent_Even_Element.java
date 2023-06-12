class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int maxelement = 0;
        for(int num:nums){
            if(count == 0){
                maxelement = num;
            }
            if(maxelement == num){
                count++;
            }
            else{
                count--;
            }
        }
        return maxelement;
    }
}
