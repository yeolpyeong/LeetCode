class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet check = new HashSet<Integer>();
        for (int num:nums) {
            if (check.contains(num)) {
                return true;
            }
            check.add(num);
        }
        return false;
    }
}