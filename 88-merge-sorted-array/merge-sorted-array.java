class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=0;
        int r=0;
        if(nums1[l]==0 && nums2.length==1){
            nums1[l]=nums2[r];
        }
        while(l<(m+n) && r<n){
           if(nums1[l]==0){
                nums1[l]=nums2[r];
                l++;
                r++;
           }else if(nums1[l]<=nums2[r]){
                l++;
           }else{
                nums1[m+r]=nums1[l];
                nums1[l]=nums2[r];
                l++;
                r++;
           }
        }
        Arrays.sort(nums1);
    }
}