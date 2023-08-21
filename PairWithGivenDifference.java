import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairWithGivenDifference {
    public static void main(String[] args) {
        int arr[] = {1, 8, 30, 40, 100};
        int n = -60;
        findPair(arr,n);
    }

    private static void findPair(int[] arr, int n) {

        // Approach - 1 O(nLogn) time since we are sorting the array and O(1) space
        // sort the array given
        // Arrays.sort(arr);

        // int i = 0, j = 0;

        // while(i < arr.length && j < arr.length){
        //     if(i != j && (arr[j] - arr[i] == n || arr[i] - arr[j] == n)){
        //         System.out.println("Pair found (" + arr[i] + ", " + arr[j] + ")");
        //         return;
        //     }
        //     // if the difference is smaller, then we need larger difference
        //     else if(arr[j] - arr[i] < n){
        //         j++; // to make bigger difference
        //     }
        //     else{
        //         i++; // to make smaller difference
        //     }
        // }

        // Approach - 2 O(n) time and O(n) space

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i] - Math.abs(n))){
                System.out.println("Pair found (" + arr[map.get(arr[i] - Math.abs(n))] + ", " + arr[i] + ")");
                return;
            }

            map.put(arr[i], i);
        }

    }
}
