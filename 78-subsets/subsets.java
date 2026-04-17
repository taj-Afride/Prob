class Solution {
    public void findSub(int nums[],int i,List<Integer> curr,List<List<Integer>> ls){
        if(i==nums.length){
            ls.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        findSub(nums,i+1,curr,ls);
        curr.remove(curr.size()-1);
        findSub(nums,i+1,curr,ls);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        findSub(nums,0,new ArrayList<>(),result);
        return result;
    }
}