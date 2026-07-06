class Solution {
    public long total(int piles[],int n){
        long tot=0;
        for(int i=0;i<piles.length;i++){
            tot+=(piles[i] + n - 1L) / n;
        }
        return tot;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=-1;
        int ans=0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(piles[i],max);
        }
        int l=1;
        int x=max;
        while(l<=x){
            int mid=l+(x-l)/2;
            long totalhours=total(piles,mid);
            if(totalhours<=h){
                ans=mid;
                x=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}