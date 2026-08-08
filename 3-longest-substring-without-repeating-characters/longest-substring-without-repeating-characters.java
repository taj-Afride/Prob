class Solution {
    public int lengthOfLongestSubstring(String s) {
        int freq[]=new int[128];
        int ans=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            while(freq[ch] > 0) {
                freq[s.charAt(left)]--;
                left++;
            }
            freq[ch]++;
            
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}