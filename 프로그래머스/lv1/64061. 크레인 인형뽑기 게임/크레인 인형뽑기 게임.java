import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> crain = new Stack<>();
        crain.push(0);
        int k = 0;
        
        for(int i = 0; i < moves.length; i++){      // 문제 반복
            for(int j  = 0; j < board.length; j++){ // 세로 반복
                if(board[j][moves[i]-1] != 0){        // 맨위를 잡았을 때
                    if(crain.peek() == board[j][moves[i]-1] ){ // 스택 top과 비교
                        crain.pop();
                        answer += 2;
                    }else{
                        crain.push(board[j][moves[i]-1]);
                    }
                    board[j][moves[i]-1] = 0;             
                    break;
                }
            }
        }
        return answer;
    }
}