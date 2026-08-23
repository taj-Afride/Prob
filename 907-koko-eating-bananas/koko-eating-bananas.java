class Solution {
    public long canEat(int arr[],int m){
        long tH=0;
        for(int i=0;i<arr.length;i++){
            tH+=((m+arr[i]-1)/m);
        }
        return tH;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        int ans=0;
        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canEat(piles,mid)<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}