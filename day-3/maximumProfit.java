// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        
        
        // int max = 0;
        // int z = 0;
        
        // for(int i = 0; i < prices.length - 1; i++) {
        //     int j = i + 1;
            
        //     if(prices[z] <= prices[j]) {
        //         int stock = prices[j] - prices[z];
        //         max = Math.max(max, stock);
        //     } else {
        //         z = j;
        //     }
        // }
        // return max;
        
        
        int max = 0;
        
        int z = 0;
        
        for(int i = 0; i < prices.length - 1; i++) {
            int j = i + 1;
            if(prices[z] <= prices[j]) {
                int profit = prices[j] - prices[z];
                max = Math.max(max, profit);
            } else {
                z = j;
            }
        }
        return max;
    }
}