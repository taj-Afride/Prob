import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        String x=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int l=0;
        int r=x.length()-1;
        while(l<r){
            if(x.charAt(l)==x.charAt(r)){
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}