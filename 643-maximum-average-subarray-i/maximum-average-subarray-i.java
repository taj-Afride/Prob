class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        double maxAV=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxAV=(double)sum/k;
        for(int i=k;i<n;i++){
            sum-=nums[i-k];
            sum+=nums[i];
            double av=(double)sum/k;
            maxAV=Math.max(maxAV,av);
        }
        return maxAV;
    }
}