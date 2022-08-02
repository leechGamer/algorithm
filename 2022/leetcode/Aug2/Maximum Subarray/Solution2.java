class Solution {
    public int maxSubArray(int[] nums) {
        return solve(nums, 0, nums.length - 1);
    }
    
    int solve(int[] nums, int lo, int hi) {
        if(lo >= hi) {
            return nums[lo];
        }
        int mid = lo + (hi - lo) / 2;
        int L = solve(nums, lo, mid - 1);
        int R = solve(nums, mid + 1, hi);
        int C = cross(nums, lo, mid, hi);
        return Math.max(L, Math.max(R, C));
    }
    
    int cross(int[] nums, int lo, int mid, int hi) {
        int left = 0, maxLeft = 0;
        int right = 0, maxRight = 0;
        for(int i = mid - 1; i >= lo; i--) {
            left += nums[i];
            maxLeft = Math.max(left, maxLeft);
        }
        for(int i = mid + 1; i <= hi; i++) {
            right += nums[i];
            maxRight = Math.max(right, maxRight);
        }
        return maxLeft + maxRight + nums[mid];
    }
}

// 잘몰라서 분할 정복으로 쓴 답안 인터넷 답안 참조..
// 하지만 이전에 풀었던 버전(1 ms	52.3 MB)이 더 빠르다. 
// Accepted	15 ms	73.7 MB
