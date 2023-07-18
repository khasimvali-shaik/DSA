import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,  2,  3,  4},
            {12, 13, 14, 5},
            {11, 16, 15, 6},
            {10,  9,  8, 7}
        };

        System.out.println(printSpiral(matrix));
    }

    private static List<Integer> printSpiral(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length == 0) return res;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(top <= bottom && left <= right){

            for(int i=left; i<=right; i++){
                res.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                for(int i=right; i>=left; i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}
