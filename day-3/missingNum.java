class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length + 1;  // total range
        
        long total = (long) n * (n + 1) / 2;  // total sum 1....n
        
        long sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];  // array r sob element er sum
        }
        
        return (int) (total - sum); //missing no
    }
}