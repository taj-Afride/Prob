class Solution {
    public int firsto(int[] nums,int n,int k){
        int first=-1;
        int l=0,r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==k){
                first=mid;
                r=mid-1;
            }
            else if(nums[mid]<k){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return first;
    }
     public int lasto(int[] nums,int n,int k){
        int last=-1;
        int l=0,r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==k){
                last=mid;
                l=mid+1;
            }
            else if(nums[mid]<k){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int first=firsto(nums,nums.length,target);
        if(first==-1) return new int[] {-1,-1};
        int last=lasto(nums,nums.length,target);
        return new int[] {first,last};
    }
}