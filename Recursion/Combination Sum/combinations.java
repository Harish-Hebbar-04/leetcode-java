
https://leetcode.com/problems/combinations/
class Solution {
    private void func(int ind,int n,int k,List<Integer> ds,List<List<Integer>> ans){
        // int [] arr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=i+1;
        // }
        if(ds.size()==k){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<=n;i++){
         ds.add(i);
         func(i+1,n,k,ds,ans);
         ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        func(1,n,k,new ArrayList<>(),ans);
        return ans;
    }
}
