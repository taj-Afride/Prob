class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nG[]=new int[nums2.length];
        int NEXT[]=new int[nums1.length];
        Stack<Integer> s=new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!s.isEmpty()&& nums2[s.peek()] < nums2[i]){
                s.pop();
            }
            if(s.isEmpty()){
                int f=-1;
                nG[i]=f;
            }
            else{
                int f=nums2[s.peek()];
                nG[i]=f;
            }
            s.push(i);
        }
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],nG[i]);
        }
        for(int i=0;i<nums1.length;i++){
            NEXT[i]=map.get(nums1[i]);
        }
        
        return NEXT;
    }
}