import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input array size
        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Step 2: Input array elements
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Step 3: Sort the array (Binary Search requires sorted array)
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Step 4: Input the target value
        System.out.print("Enter the value to search: ");
        int target = scanner.nextInt();

        // Step 5: Binary search logic
        int left = 0;
        int right = size - 1;
        int position = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                position = mid;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        // Step 6: Output result
        if (position != -1) {
            System.out.println("Element found at index: " + position);
        } else {
            System.out.println("Element not found.");
        }

        scanner.close();
    }
}
