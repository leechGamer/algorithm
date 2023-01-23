class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }
        int max = Integer.MIN_VALUE;
        int acc = 0;

        for (int i=0;i<nums.length;i++) {
            acc += nums[i];
            max = Math.max(max, acc);

            if(acc < 0) acc = 0;
        }
        return max;
    }
}
