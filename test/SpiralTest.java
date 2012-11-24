import junit.framework.Assert;
import org.junit.Test;

/**
* User: jlauer
* Date: 12/11/12
* Time: 9:38 PM
*/
public class SpiralTest {
    @Test
    public void testPrintSpiral() throws Exception {
        Assert.assertEquals("0", Spiral.printSpiral(createGrid(1,1), 1, 1));
        Assert.assertEquals("0132", Spiral.printSpiral(createGrid(2, 2), 2, 2));
        Assert.assertEquals("012587634", Spiral.printSpiral(createGrid(3, 3), 3, 3));
    }

    public int[][] createGrid(int rows, int cols) {
        int[][] grid = new int[rows][cols];
        int current = 0;
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                grid[i][j] = current++;
            }
        }
        return grid;
    }
}
