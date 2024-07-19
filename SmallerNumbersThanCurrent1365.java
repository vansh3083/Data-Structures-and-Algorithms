class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int temp = nums[i];
            int count=0;
            for(int j=0; j<nums.length; j++){
                if(temp > nums[j]&& j !=i){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}