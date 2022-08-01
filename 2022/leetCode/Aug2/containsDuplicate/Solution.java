class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i=0;i<nums.length;i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}


/**
    3분 소요
    Started        08/02/2022 08:14
    Time Submitted 08/02/2022 08:17	Accepted	30 ms 72.7 MB
*/


/**
    set으로 개선
    7 ms	68.9 MB	
*/
