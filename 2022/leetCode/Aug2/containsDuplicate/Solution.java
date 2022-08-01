class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        
        Arrays.sort(nums);
        int pre = nums[0];
        for (int i=1;i<nums.length;i++) {
            if (nums[i] == pre) {
                return true;
            }
            pre = nums[i];
        }
        return false;
    }
}

/**
3분 소요
Started        08/02/2022 08:14
Time Submitted 08/02/2022 08:17	Accepted	30 ms 72.7 MB
*/
