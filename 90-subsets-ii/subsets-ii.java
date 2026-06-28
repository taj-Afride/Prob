class Solution {
    public void subset(int nums[],int i,ArrayList<Integer> ls,HashSet<List<Integer>> res){
        if(i==nums.length){
            res.add(new ArrayList<>(ls));
            return;
        }
        ls.add(nums[i]);
        subset(nums,i+1,ls,res);
        ls.remove(ls.size()-1);
        subset(nums,i+1,ls,res);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        subset(nums,0,new ArrayList<>(),set);
        return new ArrayList<>(set);
    }
}