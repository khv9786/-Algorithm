import java.util.*;

public class Solution {

    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        // 이미 있다면 +1
        Map<String, Integer> discountMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            discountMap.put(discount[i], discountMap.getOrDefault(discount[i], 0) + 1);
        }

        if (matches(wantMap, discountMap)) {
            answer++;
        }

        // 하나씩 오른쪽으로 옮기면서 검사하기.
        for (int i = 10; i < discount.length; i++) {
            String oldItem = discount[i - 10];
            String newItem = discount[i];

            discountMap.put(oldItem, discountMap.get(oldItem) - 1);
            if (discountMap.get(oldItem) == 0) {
                discountMap.remove(oldItem);
            }

            discountMap.put(newItem, discountMap.getOrDefault(newItem, 0) + 1);

            // want와 비교
            if (matches(wantMap, discountMap)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean matches(Map<String, Integer> wantMap, Map<String, Integer> discountMap) {
        for (String key : wantMap.keySet()) {
            if (discountMap.getOrDefault(key, 0) < wantMap.get(key)) {
                return false;
            }
        }
        return true;
    }

}
