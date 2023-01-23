class Solution {
    public int[] runningSum(int[] nums) {
        int j = 0;
        int[] result = new int[nums.length];
        result[j++] = nums[0];
        int acc = result[0];
        while (j < nums.length) {
            result[j] = acc + nums[j];
            acc = result[j++];
        }
        return result;
    }
}
