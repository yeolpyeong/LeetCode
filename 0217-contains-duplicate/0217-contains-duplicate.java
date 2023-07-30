class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap check = new HashMap<Integer, Boolean>();
        for (int num:nums) {
            if (!check.containsKey(num)) {
                check.put(num, true);
            } else {
                return true;
            }
        }
        return false;
    }
}