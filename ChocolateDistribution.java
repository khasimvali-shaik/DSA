import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int[] input = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;

        System.out.println(distribute(input, m));
    }

    private static int distribute(int[] input, int m) {

        Arrays.sort(input);
        int minDif = Integer.MAX_VALUE;

        for(int i=0; i + m - 1 < input.length; i++){
            int diff = input[i + m - 1] - input[i];
            if(diff < minDif) minDif = diff;
        }
        return minDif;
    }
}
