class Solution {
    public boolean possible(int arr[],int days,int k){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
           cnt+=(arr[i]+days-1)/days;
        }
        if(cnt<=k){
            return true;
        }
        return false;
    }
    public int smallestDivisor(int[] nums, int threshold) {
         int max=Integer.MIN_VALUE,min=1;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        int ans=0;
        while(min<=max){
            int mid=min+(max-min)/2;
            if(possible(nums,mid,threshold)){
                ans=mid;
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return ans;
    }
}