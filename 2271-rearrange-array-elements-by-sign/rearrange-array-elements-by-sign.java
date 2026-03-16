class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> le=new ArrayList<>();
        ArrayList<Integer> lo=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                le.add(nums[i]);
            }
            else{
                lo.add(nums[i]);
            }
        }
        int p=0;
        int q=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=le.get(p++);
            }
            else{
                nums[i]=lo.get(q++);
            }
        }
        return nums;
    }
}