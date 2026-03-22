class Solution {
    private int[][] rotate(int mat[][]){
        int n=mat.length;
        int rotated[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotated[j][n-1-i]=mat[i][j];
            }
        }
        return rotated;
    }
    private boolean aE(int a[][],int b[][]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]!=b[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            if(aE(mat,target)){
                return true;
            }
            mat=rotate(mat);
        }
        return false;
    }
}