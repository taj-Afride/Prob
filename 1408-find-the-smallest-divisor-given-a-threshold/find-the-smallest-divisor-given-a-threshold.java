class Solution {
    public boolean possible(int nums[],int t,int d){
        int result=0;
        for(int i=0;i<nums.length;i++){
            result+=(nums[i]+d-1)/d;
        }
        return result<=t;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=-1;
        for(int i=0;i<nums.length;i++){
            high=Math.max(nums[i],high);
        }
        int divisor=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(nums,threshold,mid)){
                divisor=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return divisor;
    }
}