class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        if(nums.length==1) return nums[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if (mid == 0) {
                if (nums[mid] != nums[mid + 1])
                    return nums[mid];
            }

            if (mid == nums.length - 1) {
                if (nums[mid] != nums[mid - 1])
                    return nums[mid];
            }

            if (nums[mid] != nums[mid - 1] &&
                nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            if(nums[mid]==nums[mid-1]){
                if(mid%2==0){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(mid%2==0){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}