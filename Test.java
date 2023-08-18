public class Test {
    public static void main(String[] args) {
        char[][] matrix = {
            {'A', 'B', 'C', 'E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCCED";

        System.out.println(wordSearch(matrix, word));
    }

    private static boolean wordSearch(char[][] m, String word) {

        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                if(m[i][j] == word.charAt(0) && search(i, j, 0, m, word)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean search(int i, int j, int index, char[][] m, String word){
        if(index == word.length()){
             return true;
        }

        if(i < 0 || i >= m.length || j < 0 || j >= m[0].length || m[i][j] != word.charAt(index)){
            return false;
        }

        char temp = m[i][j];
        m[i][j] = ' ';

        boolean isFind = (search(i + 1, j, index+1, m, word) ||
                        search(i - 1, j, index+1, m, word) ||
                        search(i, j+1, index+1, m, word) ||
                        search(i, j-1, index, m, word));

        m[i][j] = temp;
        return isFind;
    }
}
