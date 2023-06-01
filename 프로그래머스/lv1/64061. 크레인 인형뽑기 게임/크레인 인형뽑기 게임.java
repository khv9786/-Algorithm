import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> crain = new Stack<>();
        crain.push(0); //비교를 위해 0 삽입
        int k = 0;
        
        for(int i = 0; i < moves.length; i++){      // 문제 반복
            for(int j  = 0; j < board.length; j++){ // 세로 반복
                if(board[j][moves[i]-1] != 0){        // 맨위를 잡았을 때
                    if(crain.peek() == board[j][moves[i]-1] ){ // 스택 top과 비교
                        crain.pop();
                        answer += 2;
                    }else{
                        crain.push(board[j][moves[i]-1]); // 같지 않다면 스택에 삽입
                    }
                    board[j][moves[i]-1] = 0;             // 뽑은 위치는 0으로 설정
                    break;
                }
            }
        }
        return answer;
    }
}