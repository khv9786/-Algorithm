class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = brown + yellow;
        
        for (int row = 3; row <= Math.sqrt(sum); row++) {
            if (sum % row == 0) {
                int col = sum / row;
                if ((col - 2) * (row - 2) == yellow) {
                    answer[0] = col;
                    answer[1] = row;
                    break;
                }
            }
        }
        
        return answer;
    }
}
