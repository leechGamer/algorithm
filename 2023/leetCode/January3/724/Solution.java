class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int total = 0;
        for (int i=0;i<nums.length;i++) {
            total += nums[i];
        }
        int i = 0;
        int leftSum = 0;
        int rightSum = total - nums[i] - leftSum;

        while (i+1 < nums.length && leftSum != rightSum) {
            leftSum += nums[i];
            rightSum = total - nums[++i] - leftSum;
            if (leftSum == rightSum) {
                return i;
            }
        }

        if (++i == nums.length) {
            return -1;
        }
        return --i;
    }
}
