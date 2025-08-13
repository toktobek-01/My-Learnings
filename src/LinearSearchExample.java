import java.util.Scanner;

public class LinearSearchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input for array size
        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Step 2: Input array elements
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Step 3: Input the value to search
        System.out.print("Enter the value to search: ");
        int target = scanner.nextInt();

        // Step 4: Perform linear search
        int position = -1; // -1 means not found
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                position = i;
                break;
            }
        }

        // Step 5: Display result
        if (position != -1) {
            System.out.println("Element found at index: " + position);
        } else {
            System.out.println("Element not found.");
        }

        scanner.close();
    }
}
