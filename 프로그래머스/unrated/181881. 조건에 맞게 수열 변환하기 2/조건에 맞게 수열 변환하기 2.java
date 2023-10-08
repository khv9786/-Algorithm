import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = -1;
        int[] before = new int[arr.length];
        int cnt = 0;

        while (cnt != arr.length) {
            before = Arrays.copyOf(arr, arr.length);
            cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0){
                    arr[i] = (arr[i] * 2) + 1;
                }

                if (arr[i] == before[i]) {
                    cnt++;
                }
            }

            answer++;
        }

        return answer;
    }
}
