import java.util.Arrays;
import java.util.Collections;

public class PermuteTwoArrays {
    public static void main(String[] args) {
        Integer[] a = {2, 1, 3};
        int[] b = { 7, 8, 9 };
        int k = 10;
        /*
            Check if the pair of each element in two arrays is greater than or equal to k
            a[i] + b[i] >= k
        */
        System.out.println(check(a, b, k));
    }

    private static boolean check(Integer[] a, int[] b, int k) {
        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b);

        for(int i=0; i<a.length; i++){
            if(a[i] + b[i] < k){
                return false;
            }
        }
        return true;
    }
}
