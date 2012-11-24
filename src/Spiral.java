/**
 * User: jlauer
 * Date: 12/11/12
 * Time: 9:35 PM
 */
public class Spiral {

    /**
     * Returns a string of the ints in the grid in a counter clockwise spiral
     * @param grid the 2d grid of ints
     * @param rows # of rows
     * @param cols # of columns
     * @return ints comma seperated
     */
    public static String printSpiral(int[][] grid, int rows, int cols) {
        int squaresLeft = rows * cols;
        boolean[][] traversed = new boolean[rows][cols];
        StringBuilder sb = new StringBuilder();
        int currentX = -1, currentY = 0;
        while(squaresLeft > 0) {
            // right
            while (isValid(currentX + 1, currentY, rows, cols, traversed)) {
                currentX++;
                traversed[currentX][currentY] = true;
                squaresLeft--;
                sb.append(grid[currentX][currentY]);
            }
            
            // down
            while (isValid(currentX, currentY + 1, rows, cols, traversed)) {
                currentY++;
                traversed[currentX][currentY] = true;
                squaresLeft--;
                sb.append(grid[currentX][currentY]);
            }

            // left
            while (isValid(currentX - 1, currentY, rows, cols, traversed)) {
                currentX--;
                traversed[currentX][currentY] = true;
                squaresLeft--;
                sb.append(grid[currentX][currentY]);
            }
            
            // up
            while (isValid(currentX, currentY - 1, rows, cols, traversed)) {
                currentY--;
                traversed[currentX][currentY] = true;
                squaresLeft--;
                sb.append(grid[currentX][currentY]);
            }
        }

        return sb.toString();
    }

    private static boolean isValid(int x, int y, int rows, int cols, boolean [][] traversed) {
        return x >= 0 && y >= 0 && x < rows && y < cols && !traversed[x][y];
    }
}
