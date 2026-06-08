class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet<>();
        while(!hs.contains(n)){
            hs.add(n);
            int result=0;
            while(n!=0){
                int b=n%10;
                result+=b*b;
                n=n/10;
            }
            if(result==1){
                return true;
            }
            n=result;
        }
        return false;
    }
}