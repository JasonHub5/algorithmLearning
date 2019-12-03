package graph;

import org.junit.Test;

public class FloodFillTest {
    @Test
    public void test() {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] newImage = FloodFill.floodFill(image, 1, 1, 2);
        for (int[] arr : newImage) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
