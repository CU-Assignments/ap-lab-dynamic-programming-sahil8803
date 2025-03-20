class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum =0;
        for(int x : nums){
            curSum += x;
            maxSum = Math.max(curSum, maxSum);
            if(curSum<0){
                curSum = 0;
            }
        }
        return maxSum;
    }
}
