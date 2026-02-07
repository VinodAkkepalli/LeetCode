class Solution {
    public int findMin(int[] arr) {
        int first = 0;
        int last = arr.length-1;
        int mid =0;

        while (first <= last) {

            if(arr[first] <= arr[last]) {
                return arr[first];
            }

            mid = (first + last)/2;

            if(arr[mid] > arr[last]) {
                first = mid+1;
            } else {
                last = mid;
            }
        }
        return 0;
    }
}