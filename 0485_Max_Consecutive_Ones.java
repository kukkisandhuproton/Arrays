class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int variablecount = 0;
        int maxcount = 0;
        for(int num:nums){
            if(num == 1){
                variablecount++;
                maxcount = Math.max(maxcount,variablecount);
            }
            else{
                variablecount=0;
            }
        }
        return maxcount;
    }
}
