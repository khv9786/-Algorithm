class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int size = Math.max(row, col);

        int[][] temp = new int[size][size];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[i][j] = arr[i][j];
            }
        }

        return temp;
    }
}
