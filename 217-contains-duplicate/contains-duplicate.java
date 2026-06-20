class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> ls=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(ls.containsKey(nums[i])){
                return true;
            }
            ls.put(nums[i],1);
        }
        return false;
    }
}