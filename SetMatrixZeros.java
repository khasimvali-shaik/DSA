public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] M = {
            {0,1,2,0},
            {3,4,5,2},
            {1,3,1,5}
        };

        M = setZeros(M);
        for(int i=0; i<M.length; i++){
            for(int j=0; j<M[0].length; j++){
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] setZeros(int[][] m) {
        int[] row = new int[m.length];
        int[] col = new int[m[0].length];

        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                if(m[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                if(row[i] == 1 || col[j] == 1){
                    m[i][j] = 0;
                }
            }
        }
        return m;
    }
}
