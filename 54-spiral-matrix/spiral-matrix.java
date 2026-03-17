class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ls=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int t=0,b=n-1,s=0,l=m-1;
        while(t<=b && s<=l){
            for(int i=s;i<=l;i++){
                ls.add(matrix[t][i]);
            }
            t++;
            for(int k=t;k<=b;k++){
                ls.add(matrix[k][l]);
            }
            l--;
            if(t<=b){
            for(int y=l;y>=s;y--){
                ls.add(matrix[b][y]);
            }
            b--;
            }
            if(s<=l){
            for(int a=b;a>=t;a--){
                    ls.add(matrix[a][s]);
            }
            s++;
            }
        }
        return ls;

    }
}