package com.orangeaterz.leetcode.exercise;

public class IslandNumber {
    private static int length;
    private static int width;

    public static void main(String[] ars) {

    }
//            [1, 1, 0, 0, 0],
//            [0, 1, 0, 0, 1],
//            [0, 0, 0, 1, 1],
//            [0, 0, 0, 0, 0],
//            [0, 0, 0, 0, 1]]


    public static int numbersIsland(boolean[][] grid) {
        length = grid.length;
        if (length == 0) return 0;
        width = grid[0].length;
        if (width == 0) return 0;

        int nums = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (!grid[i][j]) continue;
                nums++;
                checkPoint(grid, i, j);
            }
        }


        return nums;
    }

    public static void checkPoint(boolean[][] grid, int i, int j) {
        if (i < 0 || i >= length || width < 0 || j >= width) return;
        if (grid[i][j]) {
            grid[i][j] = false;
            checkPoint(grid, i - 1, j);
            checkPoint(grid, i + 1, j);
            checkPoint(grid, i, j - 1);
            checkPoint(grid, i, j + 1);
        }
    }

}
