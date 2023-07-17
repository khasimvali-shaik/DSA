public class DiagonalMatrix {
    public static void main(String[] args) {
        int M[][] = {
            { 1,  2,  3,  4,  5,  6},
            { 7,  8,  9,  10, 11, 12},
            { 13, 14, 15, 16, 17, 18},
            { 19, 20, 21, 22, 23, 24},
        };

        printDiagonalMatrix(M);
    }

    private static void printDiagonalMatrix(int[][] m) {

        int row = m.length;
        int col = m[0].length;
        int i, j; // for row and col tracking

        for(int r=0; r<row; r++){
            i = r;
            j = 0;
            while(i >= 0 && j < col){
                System.out.print(m[i][j] + " ");
                i--;
                j++;
            }
            System.out.println();
        }

        for(int c=1; c<col; c++){
            i = row - 1;
            j = c;
            while(j < col && i >= 0){
                System.out.print(m[i][j] + " ");
                i--;
                j++;
            }
            System.out.println();
        }
    }
}
