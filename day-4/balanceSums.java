class Solution {
    public static int balanceSums(int[][] mat) {
        // code here
        
        //matrix size == [n*n]
        int n = mat.length;
        
        //row & col e rsum rakhar jonno 2 ta array
        int[] row = new int[n];
        int[] col = new int[n];
        
        // total sum & boro sum maxRow & maxCol rakar jonno duto variable
        int total = 0, maxRow = 0, maxCol = 0;
        
        //rowSum,colSum, maxRow ber kora hollo
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                row[i] += mat[i][j];
                col[j] += mat[i][j];
                
                total += mat[i][j];
            }
            maxRow = Math.max(maxRow, row[i]); //max row ber koralm
        }
        
        //max col ber korlam
        for(int j = 0; j < n; j++) {
            maxCol = Math.max(maxCol, col[j]);
        }
        
        int target = Math.max(maxRow, maxCol); // only barbe tai boro ta k nilam
        
        return n * target - total; // formula
    }
}