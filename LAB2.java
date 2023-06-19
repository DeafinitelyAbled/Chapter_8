import java.util.Scanner;
import java.util.ArrayList;

public class LAB2 {

    static int recursions=0,comparisons=0;
    private static ArrayList<Integer> readNums(Scanner scnr) {
        int size = scnr.nextInt();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < size; ++i) {
            nums.add(scnr.nextInt());
        }
        return nums;
    }

    static public int binarySearch(int target, ArrayList<Integer> integers,int lower, int upper) {
        recursions++;
        int index = (lower+upper)/2;
        if(integers.get(index)==target) {
            comparisons++;
            return index;
        }
        else if(lower==upper){
            comparisons++;
            return -1;
        }
        else if(integers.get(index)<target){
            comparisons+=2;
            return binarySearch(target, integers, index+1, upper);
        }
        else{
            comparisons+=2;
            return binarySearch(target, integers, lower, index-1);
        }
    }

    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        // Input a list of integers
        ArrayList<Integer> integers = readNums(scnr);

        // Input a target value for the search
        int target = scnr.nextInt();

        int index = binarySearch(target, integers, 0, integers.size() - 1);

        System.out.printf("index: %d, recursions: %d, comparisons: %d\n",index, recursions, comparisons);
    }
}