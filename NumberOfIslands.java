public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
          };

          System.out.println(noOfIslands(grid));
    }

    private static int noOfIslands(char[][] grid) {
        int count = 0;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == '1'){
                    count += 1;
                    searchEdjecentIslands(i, j, grid);

                }
            }
        }
        return count;
    }

    private static void searchEdjecentIslands(int i, int j, char[][] grid) {
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j] == '0')
         return;

        grid[i][j] = '0';
        searchEdjecentIslands(i+1, j, grid);
        searchEdjecentIslands(i-1, j, grid);
        searchEdjecentIslands(i, j+1, grid);
        searchEdjecentIslands(i, j-1, grid);
    }
}
