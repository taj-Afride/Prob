class Solution {
    public int srt(int nums[],int l,int r,int target){
        if(l>r){
            return -1;
        }
        int mid=l+((r-l)/2);
        if(nums[mid]==target)return mid;
        if(nums[l]<=nums[mid]){
            if(nums[l]<=target && nums[mid]>target){
                return srt(nums,l,mid-1,target);
            }
            else{
                 return srt(nums,mid+1,r,target);
            }
        }
        else{
            if(nums[mid]<target && nums[r]>=target){
                return srt(nums,mid+1,r,target);
            }
            else{
                 return srt(nums,l,mid-1,target);
            }
        }
    }
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        return srt(nums,l,r,target);
    }
}