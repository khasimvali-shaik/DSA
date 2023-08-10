import javax.sound.sampled.SourceDataLine;
import javax.swing.border.Border;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCCED";

        System.out.println(exists(board, word));
    }

    private static boolean exists(char[][] board, String word) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == word.charAt(0) && searchWord(i, j, 0, board, word)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean searchWord(int i, int j, int index, char[][] board, String word){
        if(index == word.length()){
            return true;
        }

        if(i<0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)){
            return false;
        }

        char temp = board[i][j];
        board[i][j] = ' ';

        boolean isFind = (searchWord(i+1, j, index+1, board, word) || 
                        searchWord(i-1, j, index+1, board, word) ||
                        searchWord(i, j+1, index+1, board, word) ||
                        searchWord(i, j-1, index+1, board, word));
        
        board[i][j] = temp;
        return isFind;
    }
}
