
https://leetcode.com/problems/permutations/
class Solution {
    private void func(int[] nums, boolean[] freq, List<Integer> ds, List<List<Integer>> list) {
        if (ds.size() == nums.length) {
            list.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {   //  freq[i] != true
                freq[i] = true;
                ds.add(nums[i]);
                func(nums, freq, ds, list);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        func(nums, freq, new ArrayList<>(), list);
        List<List<Integer>> ans = new ArrayList<>(list);
        return list;
    }
}
