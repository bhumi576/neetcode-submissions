class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int mainSum=0;
        int antiSum=0;
        for(int i=0;i<n;i++){
            mainSum+=mat[i][i];
            antiSum+=mat[i][n-1-i];
        }

        int sum=mainSum+antiSum;
         if(n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }
        return sum;
    }
}