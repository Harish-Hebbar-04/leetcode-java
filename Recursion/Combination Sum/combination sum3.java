
https://leetcode.com/problems/combination-sum-iii/
class Solution {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    private void func(int ind, int k, int n, List<Integer> ds, List<List<Integer>> list) {
        if (k == 0 && n == 0) {
            list.add(new ArrayList<>(ds));
            return;
        }

        if (k < 0 || n < 0) {
            return;
        }

        for (int i = ind; i < arr.length; i++) {

            ds.add(arr[i]);

            func(i + 1, k - 1, n - arr[i], ds, list);

            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        func(0, k, n, new ArrayList<>(), list);
        return list;
    }
}
