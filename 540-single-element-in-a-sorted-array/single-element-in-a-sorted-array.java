class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0;
        int h=nums.length-1;
        if(nums.length==1) return nums[0];
        while(l<=h){
            int mid=l+(h-l)/2;
            if (mid == 0) {
                if (nums[0] != nums[1]) return nums[0];
            }
            else if (mid == nums.length - 1) {
                if (nums[mid] != nums[mid - 1]) return nums[mid];
            }
            else{
                if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];
            }
            if(nums[mid]==nums[mid-1]&&nums[mid]!=nums[mid+1]){
                if(mid%2==0){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }else{
                if(mid%2!=0){
                    h=mid-1;
                }else{
                    l=mid+1;
                }
            }
        }
        return -1;
    }
}