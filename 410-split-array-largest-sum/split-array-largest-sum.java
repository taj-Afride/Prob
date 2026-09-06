class Solution {
    public boolean check(int arr[],int mid,int k){
        int time=0,sk=1;
        for(int i=0;i<arr.length;i++){
            if(time+arr[i]>mid){
                time=0;
                sk++;
            }
            time+=arr[i];
            if(sk>k)return false;
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int low=0,high=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            low=Math.max(nums[i],low);
        }
         for(int i=0;i<nums.length;i++){
            high+=nums[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(nums,mid,k)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}