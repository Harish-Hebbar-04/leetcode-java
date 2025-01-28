//Time Complexity:O(n^2)
//Space Complexity:O(1)
class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        int swapCount = 0; // Counter for swaps

        // Start from the second element
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // The current element to be inserted
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Shift element to the right
                j = j - 1;
                swapCount++; // Increment swap count
            }
            arr[j + 1] = key; // Place the key element in the correct position
        }

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Print the total number of swaps
        System.out.println("\nNumber of swaps: " + swapCount);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        System.out.println("Before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
        insertionSort(arr); // Sort the array and print swaps and sorted array
    }
}
