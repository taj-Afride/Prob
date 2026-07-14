class Solution {
     public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int l = 1;
        int r = x;
        int ans = 0;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return ans;
    }
    public boolean judgeSquareSum(int c) {
        int s=mySqrt(c);
        int l=0,r=s;
        while(l<=r){
            long ans=(long)l*l+r*r;
            if(ans==c) {return true;}
            else if(ans<c){
                l++;
            }else{
                r--;
            }
        }
        return false;
    }
}