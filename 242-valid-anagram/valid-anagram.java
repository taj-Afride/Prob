class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> ls=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        else{
            for(char ch : s.toCharArray()){
                ls.put(ch, ls.getOrDefault(ch,0)+1);
            }
            for(char ch : t.toCharArray()){
                if(!ls.containsKey(ch)){
                    return false;
                }
                ls.put(ch,ls.get(ch)-1);
            }
            for(int val:ls.values()){
                if(val!=0){
                    return false;
                }
            }
        }
        return true;
    }
}