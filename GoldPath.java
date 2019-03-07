
/**
 * Find the path that collect the most gold through a 2-D grid
 *
 * @author APCS @ HB
 * @version 2019-03-06
 */
public class GoldPath
{
    private int[][] grid;
    public static final int NUM_ROWS = 2;
    public static final int NUM_COLS = 4;
    
    // Initializes the grid with integers from 0 thru 9
    public GoldPath()
    {
        grid = new int[NUM_ROWS][NUM_COLS];
        for (int r = 0; r < grid.length; r++)
        {
            for (int c = 0; c < grid[0].length; c++)
            {
                grid[r][c] = (int)(10 * Math.random());
            }
        }
    }
    
    public int getRows()  { return grid.length;  }
    public int getCols()  { return grid[0].length; }
    
    // Simple printing of the 2D grid
    public void printGrid()
    {
        for (int[] row : grid)
        {
            for (int cell : row)
            {
                System.out.print ("  " + cell);
            }
            System.out.println();
        }
    }  
    
    /**  Find the maximum amount of gold you can collect on the way from (0, 0) to (row, col)  */
    public int maxPath (int row, int col)
    {

        return 0;
    }
    
    
    
    public static void main (String[] args)
    {
        GoldPath myGrid = new GoldPath();
        myGrid.printGrid();
        System.out.println("\nThe maximum gold collected is " + 
            myGrid.maxPath(myGrid.getRows() - 1, myGrid.getCols() - 1));
    }
}
