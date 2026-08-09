class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int left=0;
        int right=0;
        while(left<s.length && right<g.length){
            if(s[left]>=g[right]){
                right++;
            }
            left++;
        }
        return right;
    }
}