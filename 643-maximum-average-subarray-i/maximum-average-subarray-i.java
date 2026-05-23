class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=0;
        for(int i=0;i<k;i++){
            max+=nums[i];
        }
        double avge=max/k;
        for(int i=k;i<nums.length;i++){
            max=max+nums[i]-nums[i-k];
            avge=Math.max(avge,max/k);
        }
        return avge;
    }
}