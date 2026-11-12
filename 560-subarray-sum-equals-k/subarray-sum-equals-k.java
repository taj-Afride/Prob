class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int ps=0;
        for(int num:nums){
            ps+=num;
            int req=ps-k;
            if(map.containsKey(req)){
                count+=map.get(req);
            }
            map.put(ps,map.getOrDefault(ps,0)+1);

        }
        return count;
    }
}