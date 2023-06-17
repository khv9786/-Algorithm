import java.util.*;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        Arrays.sort(data, (o1, o2) -> {       // 2차원 배열 정렬.
            if (o1[col - 1] == o2[col - 1]) { // 만약 col번째가 같다면.
                return o2[0] - o1[0];         // 첫번째 칼럼 내림차순 정렬
            } else {
                return o1[col - 1] - o2[col - 1]; // 같지 않다면 오름차순 정렬
            }
        });
        for (int i = row_begin - 1; i < row_end; i++) { // begin ~ end 반복문
            int sum = 0;
            for (int column : data[i]) { // S_i 계산해서 sum에 넣기
                sum += (column % (i + 1));
            }
            answer ^= sum;  // ^기호로 XOR 연산
        }
        return answer;
    }
}