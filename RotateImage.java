public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // rotate(matrix);
        rotateImage(matrix);
    }

    // Optimal - transpose the matrix and then reverse the each row
    private static void rotateImage(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int temp = -1;

        // transpose the matrix
        for(int i=0; i<row - 1; i++){
            for(int j=i+1; j<col; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse the each row
        for(int i=0; i<row; i++){
            int l = 0;
            int r = col-1;
            while(l < r){
                temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
        }

        display(matrix, row, col);
    }

    // BruteForce approach
    private static void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] res = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                res[j][row - 1 - i] = matrix[i][j];
            }
        }

        display(res, row, col);
    }

    private static void display(int[][] res, int row, int col){
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
