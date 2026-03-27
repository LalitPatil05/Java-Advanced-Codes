public class BinarySearchExample {

    public static int BinarySearchTechnique(int arr[], int size, int ele) {
        int low = 0;
        int high = size - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == ele) {
                return mid;
            } 
            else if (arr[mid] < ele) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return -1; // element not found
    }

    public static void main(String args[]) {

        int arr[] = {1,2,3,4,4,5,6,7,8,9,33}; // sorted array
        int size = arr.length;
        int element = 3;

        int index = BinarySearchTechnique(arr, size, element);

        System.out.println("Element Found at the Location: " + index);
    }
}