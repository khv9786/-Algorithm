class Solution {
    
    public static int [] dh = {0, 1, -1, 0};
    public static int [] dw = {1, 0, 0, -1};
    
    public int solution(String[][] board, int h, int w) {
        
        int answer = 0;
        String now_col = board[h][w];
        int n = board.length;
        
        for(int i = 0; i<4; i++){
            int cur_h = h + dh[i];
            int cur_w = w + dw[i];
            
            if(cur_h >= 0 && cur_w >= 0 && cur_w < n && cur_h < n ){
              if(board[cur_h][cur_w].equals(now_col)){
                answer++;
                }
            }                    
        }
        
        
        return answer;
    }
}