class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int length=0;
        int maxlength=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                maxlength=Math.max(length,maxlength);
                length=0;
            }else{
                length++;
            }
        }
        return Math.max(maxlength,length);
    }
}