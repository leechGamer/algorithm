class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> n = new HashSet<>();
        for (Integer num : nums) {
            if (n.contains(num)) {
                return true;
            }
            n.add(num);
        }
        return false;
    }
}
