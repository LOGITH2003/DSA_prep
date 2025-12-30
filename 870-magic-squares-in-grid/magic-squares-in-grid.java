class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        
        // condition 1:
        if(grid.length<2 || grid[0].length<2)
            return 0;

        // condition 2:
        int count = 0;

        for(int i=2; i<grid.length; i++)
            for(int j=2; j<grid[0].length; j++)
                if(checkIf(i, j, grid))
                    count++;

        return count;
    }
    public boolean checkIf(int row, int col, int [][] grid)
    {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> numberCheck = new HashSet<>();

        // col
        set.add(grid[row-2][col-1] + grid[row-1][col-1] + grid[row][col-1]);

        // row
        set.add(grid[row-1][col-2] + grid[row-1][col-1] + grid[row-1][col]);

        // left to right
        set.add(grid[row-2][col-2] + grid[row-1][col-1] + grid[row][col]);

        // right to left
        set.add(grid[row][col-2] + grid[row-1][col-1] + grid[row-2][col]);

        for(int i=0; i<3; i++)
        {
            int count1 = 0;
            int count2 = 0;
            for(int j=0; j<3; j++)
            {
                count1 += grid[row-j][col-i];
                count2 += grid[row-i][col-j];
                if(0<grid[row-i][col-j] && grid[row-i][col-j]<=9)
                    numberCheck.add(grid[row-i][col-j]);
            }
            set.add(count1);
            set.add(count2);
        }

        return set.size() == 1 && numberCheck.size() == 9;     
        
    }
}