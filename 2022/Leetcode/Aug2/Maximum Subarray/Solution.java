class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = sum;
        for (int i=1;i<nums.length;i++) {
           sum = Math.max(nums[i], sum + nums[i]);
           max = Math.max(max, sum); 
        }
        
        return max;
    }
}

// 이전에 풀었던 version
