class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash=new HashSet<>();
        for(int n:nums){
            hash.add(n);
        }
        int l=0;
        for(int n:hash){
            if(!hash.contains(n-1)){
                int x=n;
                int c=1;
                while(hash.contains(x+1)){
                    x+=1;
                    c+=1;
                }
                l=Math.max(l,c);
            }
        }
        return l;
    }
}