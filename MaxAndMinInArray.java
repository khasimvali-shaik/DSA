
import java.util.Arrays;

public class MaxAndMinInArray {
    public static void main(String[] args) {
        int[] arr = { 22, 14, 8, 17, 35, 3 };
        findMaxAndMin(arr);
    }

    public static void findMaxAndMin(int[] arr) {
        // without sortin
        /*
         * int max = arr[0];
         * int min = arr[1];
         * 
         * for (int i : arr) {
         * if (i > max)
         * max = i;
         * if (i < min)
         * min = i;
         * }
         * System.out.println("Maximun " + max + " Minimun " + min);
         */

        // with sorting
        Arrays.sort(arr);
        System.out.println("Maximun " + arr[arr.length - 1] + " Minimum " + arr[0]);

    }
}
