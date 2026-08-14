class Solution {
    public void swap(int[] a,int l,int r){
        int temp=a[l];
        a[l]=a[r];
        a[r]=temp;
    }
    public void moveZeroes(int[] nums) {
        int l=0;
        for(int i=0;i<nums.length;i++){   
            if(nums[i]!=0){
                swap(nums,l,i);
                l++;
            }
        }
    }
}