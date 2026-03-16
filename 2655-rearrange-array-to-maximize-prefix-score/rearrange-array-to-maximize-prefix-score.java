class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        long prefix[]=new long[n];
        prefix[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            prefix[i]=prefix[i+1]+nums[i];
        }
        long maxS=0;
        for(int i=0;i<nums.length;i++){
            if(prefix[i]>0){
                maxS++;
            }
        }
        return (int)maxS;
    }
}