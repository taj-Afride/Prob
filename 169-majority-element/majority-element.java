class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> ls=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           ls.put(nums[i],ls.getOrDefault(nums[i],0)+1);
        }
        int result=0;
        for(Map.Entry<Integer,Integer> entry : ls.entrySet()){
            if(entry.getValue() > nums.length/2){
                result=entry.getKey();
            }
        }
        return result;
    }
}