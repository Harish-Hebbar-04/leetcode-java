https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int res=0;
        while(l<r){
            int area=(r-l) * Math.min(height[l],height[r]);
            res=Math.max(res,area);

            if(height[l]<height[r]){
                l+=1;
            }else{
                r-=1;
            }
        }
        return res;
    }
}
