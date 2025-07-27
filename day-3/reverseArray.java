class Solution {
    public void reverseArray(int arr[]) {
        // code here
        
    //     for(int i = 0; i < arr.length / 2; i++) {
    //         int a = arr[i];
    //         arr[i] = arr[arr.length - 1 - i];
    //         arr[arr.length - 1 - i] = a;
    //     }
    // }
    
    
    for(int i = 0; i <  arr.length / 2; i++) {
        int a = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = a;
    }
    }
}