class Solution {
    private int[][] memo;

    public int solution(int[][] triangle) {
        memo = new int[triangle.length][triangle.length];
        return findMaxPath(triangle, 0, 0);
    }

    private int findMaxPath(int[][] triangle, int row, int col) {
        if (row == triangle.length - 1) { // 마지막 행이라면
            return triangle[row][col];
        }
        
        if (memo[row][col] != 0) { // 이미 저장되어 있다면 반환.
            return memo[row][col];
        }
        
        int left = findMaxPath(triangle, row + 1, col);
        int right = findMaxPath(triangle, row + 1, col + 1);
        
        memo[row][col] = triangle[row][col] + Math.max(left, right); // memo에 경로 최대값 정리
        
        return memo[row][col];
    }
}
