class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        //total jogfol, currMax total, currMiin total
        // kadane max, kadane min
        int total = 0,currMax = 0, currMin = 0, maxSum = arr[0], minSum = arr[0];
        
        // array traverse holo
        for(int i = 0; i < arr.length; i++) {
            int x = arr[i];  // bortoman element
            
            // kadane algorithm for max subarray sum
            currMax = Math.max(x, currMax + x); //x diye notun start korbo na ager ta diye cha;abo
            maxSum = Math.max(currMax, maxSum); //max sum update
            
            //kadane algo for min subarr sum
            currMin = Math.min(x, currMin + x); // x diye start korbo naki ager ta diye chalabo
            minSum = Math.min(currMin, minSum); // min sum update
            
            total += x; // total array r sum jomiye rakha
        }
        
        // jadi sum neg hoy thole wrap niye folafol aro kharap hpbe
        if(maxSum < 0) return maxSum;
        
        //max hobe jeta nonwrap(maxSum) & wrap( total - minSum) modhe j ta boro hobe
        return Math.max(maxSum, total - minSum);
    }
}
