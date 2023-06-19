import java.util.Scanner;

public class BinarySearch {
    // Solution 1
    public static int binarySearch(int[] list, int low, int high, int key) {
        int middle = (high + low) / 2;
        int size = (high - low) + 1;
        int result;

        if (key == list[middle]) {
            return middle;
        }
        else if (size == 1) {
            return -1;
        }
        else {
            if (key < list[middle]) {
                result = binarySearch(list, low, middle, key);
                return result;
            }
            else {
                result = binarySearch(list, middle + 1, high, key);
                return result;
            }
        }
    }

    // Solution 2
	/*
	  private static int binarySearch(int[] numbers, int key) {
      // Variables to hold the low, middle and high indices
      // of the area being searched. Starts with entire range.
      int low = 0;
      int mid = numbers.length / 2;
      int high = numbers.length - 1;

      // Loop until "low" passes "high"
      while (high >= low) {
         // Calculate the middle index
         mid = (high + low) / 2;

         // Cut the range to either the left or right half,
         // unless numbers[mid] is the key
         if (numbers[mid] < key) {
            low = mid + 1;
         }
         else if (numbers[mid] > key) {
            high = mid - 1;
         }
         else {
            return mid;
         }
      }

      return -1; // not found

	*/

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] list = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int i = 0; i < list.length; ++i) {
            System.out.print(list[i] + " ");
        }

        System.out.print("\nEnter a number to find a search key location index: ");
        int search = scnr.nextInt();
        int result = binarySearch(list, 0, list.length - 1, search);

        if (result < 0) {
            System.out.println("Not Found!");
        }
        else {
            System.out.println("Search key found at index location: " + result);
        }
    }

}
