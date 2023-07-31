import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10]; // 숫자의 개수를 저장하는 배열
        int[] countY = new int[10]; 
        ArrayList<Integer> list = new ArrayList<>();

        for (char c : X.toCharArray()) {
            int digit = c - '0';
            countX[digit]++;
        }
        for (char c : Y.toCharArray()) {
            int digit = c - '0';
            countY[digit]++;
        }

        for (int i = 9; i >= 0; i--) {
            int min = Math.min(countX[i], countY[i]);
            while (min > 0) {
                list.add(i);
                min--;
            }
        }

        if (list.isEmpty()) { 
            return "-1";
        } else if (list.get(0) == 0) { 
            return "0";
        } else {
            StringBuilder result = new StringBuilder();
            for (int num : list) {
                result.append(num);
            }
            return result.toString();
        }
    }
}
