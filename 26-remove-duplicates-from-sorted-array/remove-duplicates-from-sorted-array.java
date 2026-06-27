class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0;
        int r=l+1;
        if(nums.length==0)return 0;
        while(r<nums.length){
            if(nums[r]!=nums[l]){
                l++;
                nums[l]=nums[r];
            }
            r++;
        }
       return l+1;

    }
}