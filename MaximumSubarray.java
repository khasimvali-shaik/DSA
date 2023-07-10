

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(findMaxSubarray(arr));
    }

    private static int findMaxSubarray(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            sum += i;
            max = Math.max(max, sum);

            if (sum < 0)
                sum = 0;
        }
        return max;
    }
}
