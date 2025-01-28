//Time complexity: O(n^2)
//Space complexity:O(1)
class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int swapCount = 0; // Counter for swaps
        boolean swapped;

        // Outer loop for the number of passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Track if any swaps occur in this pass
            
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements if they're in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++; // Increment the swap counter
                    swapped = true; // Mark that a swap occurred
                }
            }
            
            // If no swaps occurred, the array is already sorted
            if (!swapped) {
                break;
            }
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
        bubbleSort(arr); // Sort the array and print swaps and sorted array
    }
}
