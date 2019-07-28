class Solution {
    public int largest1BorderedSquare(int[][] grid) {   
        int[][] right = new int[grid.length][grid[0].length];
        int[][] down = new int[grid.length][grid[0].length];
        int rowNum = grid.length;
        int colNum = grid[0].length;
        right[rowNum - 1][colNum - 1] = grid[rowNum - 1][colNum - 1];
        down[rowNum - 1][colNum - 1] = grid[rowNum - 1][colNum - 1];

        for (int col = colNum - 2; col >= 0; col--) {
            if (grid[rowNum - 1][col] == 1) {
                right[rowNum - 1][col] = right[rowNum - 1][col + 1] + 1;
                down[rowNum - 1][col] = 1;
            }
        }
        
        for (int row = rowNum - 2; row >= 0; row--) {
            if (grid[row][colNum - 1] == 1) {
                right[row][colNum - 1] = 1;
                down[row][colNum - 1] = down[row + 1][colNum - 1] + 1;
            }
        }

        for (int row = rowNum - 2; row >= 0; row--) {
            for (int col = colNum - 2; col >= 0; col--) {
                if (grid[row][col] == 1) {
                    right[row][col] = right[row][col + 1] + 1;
                    down[row][col] = down[row + 1][col] + 1;
                }
            }
        }

        for (int length = Math.min(grid.length, grid[0].length); length >= 1; length--) {
            if (hasSizeOfBorder(length, right, down)) {
                return length*length;
            }
        }
        return 0;
    }

    public static boolean hasSizeOfBorder(int length, int[][] right, int[][] down) {
        for (int row = 0; row + length - 1 <= right.length - 1; row++) {
            for(int col = 0; col + length - 1 <= right[0].length - 1; col++) {
                if (right[row][col] >= length && down[row][col] >= length
                        && right[row + length - 1][col] >= length
                        && down[row][col + length - 1] >= length) {
                    return true;
                }
            }
        }
        return false;
    }

}