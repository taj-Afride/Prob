class Solution {
    public boolean possible(int arr[],int days,int m,int k){
        int cnt=0,no=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=days){
                cnt++;
            }else{
                no+=(cnt/k);
                cnt=0;
            }
        }
        no+=(cnt/k);
        if(no>=m){
            return true;
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int max=Integer.MIN_VALUE,min=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]>max){
                max=bloomDay[i];
            }
        }
        int ans=0;
        if((long)m*k>bloomDay.length) return -1;
        while(min<=max){
            int mid=min+(max-min)/2;
            if(possible(bloomDay,mid,m,k)){
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