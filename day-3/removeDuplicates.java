class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();

        // যদি array ফাঁকা হয় তাহলে ফাঁকা লিস্ট রিটার্ন করব
        if (arr.length == 0) return result;

        // প্রথম উপাদানটা যোগ করি
        result.add(arr[0]);

        // তারপর ১ থেকে শুরু করে compare করি আগের উপাদানের সাথে
        for (int i = 1; i < arr.length; i++) {
            // যদি আগেরটার থেকে আলাদা হয়, তাহলে result-এ যোগ করি
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }

        return result;
    }
}
