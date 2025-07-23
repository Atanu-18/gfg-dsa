class Solution {
    public static int largest(int[] arr) {
        // code here
        // if(arr.length == 0){
        //     return arr[0];
        // }
        
        // int max = arr[0];
        // for(int i = 0; i < arr.length; i++) {
        //     if(arr[i] > max) {
        //         max = arr[i];
        //     }
        // }
        // return max;
        
        
        
        if(arr.length == 0) {
            return arr[0];
        }
        
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}