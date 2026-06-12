class Solution {
    public int maxSubArray(int[] nums) {
        int mS=nums[0];
        int cS=0;
        for(int num:nums){
            cS+=num;
            mS=Math.max(mS,cS);
            if(cS<0){
                cS=0;
            }
            
        }
        
        return mS;
    }
}