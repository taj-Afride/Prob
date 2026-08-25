class Solution {
    public boolean possible(int arr[],int k,int d){
        int p=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>k){
                p++;
                sum=0;
            }
            sum+=arr[i];
        
        }
        if(sum<=k){
            p++;
        }
        return p<=d;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int i=0;i<weights.length;i++){
            low=Math.max(low,weights[i]);
        }
        for(int i=0;i<weights.length;i++){
            high+=weights[i];
        }
        int yes=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(weights,mid,days)){
                yes=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return yes;
    }
}