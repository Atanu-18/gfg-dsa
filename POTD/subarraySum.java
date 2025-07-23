class Solution {
    public int subarraySum(int[] arr) {
        // code here
        int total = 0;
        
        for(int i = 0; i < arr.length; i++) {
            int calculation = arr[i] * (i + 1) * (arr.length - i);
            total += calculation;
        }
        
        return total;
    }
}