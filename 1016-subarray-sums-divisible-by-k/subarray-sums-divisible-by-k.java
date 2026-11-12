class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int ps=0;
        int count=0;
        for(int num:nums){
            ps+=num;
            int required=((ps%k)+k)%k;
            count+=map.getOrDefault(required,0);
            map.put(required,map.getOrDefault(required,0)+1);

        }
        return count;
    }
}