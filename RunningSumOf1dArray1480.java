class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum =0;
        for(int i=0; i<nums.length; i++){
            int temp = nums[i];
            sum = sum + temp;
            runningSum[i] = sum;
        }
        return runningSum;
    }
}