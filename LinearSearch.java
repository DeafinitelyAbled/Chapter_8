import java.util.Scanner;
public class LinearSearch {
    public static int linearSearch(int[] list, int key) {
        // Solution 1
        int result;
        boolean search = true;
        int i = 0;
        while (search && i < list.length) {
            if (list[i] == key) {
                return i;
            }
            else {
                ++i;
            }
        }
        return -1;

        // Solution 2
        /*
         * for (int i = 0; i < list.length; ++i) {
         * 		if (list[i] = key) {
         * 		return i;
         * 	}
         * }
         * return -1;
         */
    }

    public static void main(String[] args) {
        int[] list = {10, 25, 30, 5, 70, 55, 35, 80, 65, 100};
        for (int i = 0; i < list.length; ++i) {
            System.out.print(list[i] + " ");
        }
        System.out.print("\nEnter a number to find a search key location index: ");
        Scanner scnr = new Scanner(System.in);
        int search = scnr.nextInt();
        int result = linearSearch(list, search);
        if (result < 0) {
            System.out.println("Not Found!");
        }
        else {
            System.out.println("Search key found at index location: " + result);
        }

    }

}
