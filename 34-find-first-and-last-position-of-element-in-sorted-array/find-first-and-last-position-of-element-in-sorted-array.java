class Solution {
    public int findF(int nums[],int x){
       int l=0;
       int h=nums.length-1;
       int ans=-1;
       while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]>=x){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans; 
    }
    public int FindL(int nums[],int x){
        int l=0;
        int h=nums.length-1;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]<=x){
                ans=mid;
                l=mid+1;
            }
            else{
                //ans=mid-1;
                h=mid-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int first=findF(nums,target);
        if(first==-1 || nums[first]!=target){
            return new int[]{-1,-1};
        }
        int last=FindL(nums,target);
        return new int[]{first,last};
    }
}