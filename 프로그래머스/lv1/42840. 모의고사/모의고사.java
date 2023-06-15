import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();

        int[] supo1 = {1, 2, 3, 4, 5}; // 5
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5}; // 8
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10

        int point1 = 0;
        int point2 = 0;
        int point3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == supo1[i % 5])
                point1++;
            if (answers[i] == supo2[i % 8])
                point2++;
            if (answers[i] == supo3[i % 10])
                point3++;
        }

        int max = Math.max(Math.max(point1, point2), point3);

        if (max == point1)
            answer.add(1);
        if (max == point2)
            answer.add(2);
        if (max == point3)
            answer.add(3);

        return answer;
    }
}
