class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0,p=0;
        int i=0,j=numbers.length-1;
        while(i<j){
            int sum=numbers[i]+numbers[j];
            if(sum==target){
                l=i+1;
                p=j+1;
                break;
            }
            else if(sum>target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[]{l,p};
    }
}