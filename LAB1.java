import java.util.Scanner;
public class LAB1 {

    public static void selectionSortDescendTrace(int[] numbers, int numElements) {
        // Outer loop for selecting the maximum element
        for (int i = 0; i < numElements - 1; i++) {
            int maxIndex = i;
            // Inner loop for finding the maximum element
            for (int j = i + 1; j < numElements; j++) {
                if (numbers[j] > numbers[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap the maximum element with the current element
            int temp = numbers[i];
            numbers[i] = numbers[maxIndex];
            numbers[maxIndex] = temp;

            // Print the array after each iteration
            for (int k = 0; k < numElements; k++) {
                System.out.print(numbers[k] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int input, i = 0;
        int numElements = 0;
        int[] numbers = new int[10];

        // Read in a list of up to 10 positive integers; stop when -1 is read.
        while (true) {
            input = scnr.nextInt();
            if (input == -1) {
                break;
            }
            numbers[i] = input;
            i++;
            numElements++;
            if (i == 10) {
                break;
            }
        }

        // Call the selectionSortDescendTrace() method
        selectionSortDescendTrace(numbers, numElements);
    }
}