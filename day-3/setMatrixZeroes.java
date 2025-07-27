class Solution {
    public void setMatrixZeroes(int[][] mat) {
        // code here
        int n = mat.length;  // no of rows
        int m = mat[0].length;  // no of cols of rows
        
        
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];
        
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(mat[i][j] == 0) {
                    row[i] = true; //mark row
                    col[j] = true; // mark col
                }
            }
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(row[i] || col[j]) {
                    mat[i][j] = 0;
                }
            }
        }
        
        
    }
}