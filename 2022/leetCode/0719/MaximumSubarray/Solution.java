class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }
        
        int max = Integer.MIN_VALUE;
        int i = 0;
        int sum = 0;
        while (i < nums.length) {
            if (sum + nums[i] < nums[i]) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }

            if (sum > max) {
               max = sum;
            }
            i++;
        }
        return max;
    }
}
