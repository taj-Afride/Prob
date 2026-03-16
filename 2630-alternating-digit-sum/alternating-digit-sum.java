class Solution {
    public int alternateDigitSum(int n) {
        String s=String.valueOf(n);
        int arr[]=new int[s.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.charAt(i)-'0';
        }
        int add=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                add+=arr[i];
            }
            else{
                add-=arr[i];
            }
        }
        return add;
    }
}