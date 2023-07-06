import java.util.*;

class Solution {
    public static int solution(int k, int[] tangerine) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        int sum = 0;
        int ans = 0;
        List<Integer> frequencyList = new ArrayList<>(); 


        for (int frequency : map.values()) {
            frequencyList.add(frequency);
        }

        Collections.sort(frequencyList, Collections.reverseOrder());

        for (int frequency : frequencyList) {
            ans++;
            sum += frequency;
            if (sum >= k) {
                break;
            }
        }

        return ans;
    }
}
