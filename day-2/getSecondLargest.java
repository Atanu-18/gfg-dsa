class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        // int largest = -1;
        // int second = -1;

        // for (int i = 0; i < arr.length; i++) {
        //     int num = arr[i];
        //     if (num > largest) {
        //         second = largest;
        //         largest = num;
        //     } else if (num > second && num != largest) {
        //         second = num;
        //     }
        // }

        // return second;
        
        int largest = -1;
        int second = -1;
        
        for(int i = 0; i < arr.length; i++) {
            int num = arr[i];
            
            if(num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }
        return second;
    }
}