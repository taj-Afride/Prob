class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:mpp.entrySet()){
            if(entry.getValue()>(nums.length/3)){
                ls.add(entry.getKey());
            }
        }
        return ls;
    }
}