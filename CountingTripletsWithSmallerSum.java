import java.util.Arrays;

public class CountingTripletsWithSmallerSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, -2};
        int sum = 1;
       System.out.println(countTriplets(arr, sum));
    }

    private static int countTriplets(int[] arr, int sum) {
        int res = 0;

        // Sort the array first
        Arrays.sort(arr);

        for(int i=0; i<arr.length-2; i++){
            int start = i + 1;
            int end = arr.length - 1;
            while(start < end){
                if(arr[i] + arr[start] + arr[end] < sum){
                    // if arr[i] + arr[start] + arr[end] is less than sum, then all the elements
                    // before the end is smaller than end so sum will less
                    res += end - start;
                    start++;
                }
                else{
                    end--;
                }
            }
        }

        return res;
    }
}
