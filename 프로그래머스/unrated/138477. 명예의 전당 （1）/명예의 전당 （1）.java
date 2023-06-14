import java.util.*;

class Solution {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> annor = new PriorityQueue<>(); 
        // 낮은 숫자가 우선 순위. 반대로하려면 Collections.reverseOrder() 추가작성.

        for (int i = 0; i < score.length; i++) {
            annor.offer(score[i]);    // add, offer로 추가
            if (annor.size() > k) {   // 우선순위 큐 개수 > k 경우
                annor.remove();       // remove를 통해 제거.
            }
            answer[i] = annor.peek(); // 우선순위 높은 값 출력,
        }
        return answer;
    }
}