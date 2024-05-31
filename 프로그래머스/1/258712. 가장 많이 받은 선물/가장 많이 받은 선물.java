import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {

        // 친구별로 선물을 주고받은 정보를 저장할 맵
        Map<String, Map<String, Integer>> giftMap = new HashMap<>();
        // 친구별로 준 선물의 총 개수를 저장할 맵
        Map<String, Integer> giveMap = new HashMap<>();
        // 친구별로 받은 선물의 총 개수를 저장할 맵
        Map<String, Integer> getMap = new HashMap<>();

        for (String friend : friends) {
            giftMap.put(friend, new HashMap<>());
        }

        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            String from = parts[0];
            String to = parts[1];

            // from이 to에게 준 선물 수를 갱신
            giftMap.get(from).put(to, giftMap.get(from).getOrDefault(to, 0) + 1);
            // from이 준 총 선물 수를 갱신
            giveMap.put(from, giveMap.getOrDefault(from, 0) + 1);
            // to가 받은 총 선물 수를 갱신
            getMap.put(to, getMap.getOrDefault(to, 0) + 1);
        }

        // 전체 친구 비교
        Map<String, Integer> nextMap = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                String now = friends[i];
                String other = friends[j];

                // 선물 수 비교
                int nowToOther = giftMap.get(now).getOrDefault(other, 0);
                int otherToNow = giftMap.get(other).getOrDefault(now, 0);
                int diff = Integer.compare(nowToOther, otherToNow);

                // nextMap 갱신을 위한 증가값 계산
                int nowIncrement = (diff > 0 ? 1 : 0) + (diff == 0 && giveMap.getOrDefault(now, 0) - getMap.getOrDefault(now, 0) > giveMap.getOrDefault(other, 0) - getMap.getOrDefault(other, 0) ? 1 : 0);
                int otherIncrement = (diff < 0 ? 1 : 0) + (diff == 0 && giveMap.getOrDefault(other, 0) - getMap.getOrDefault(other, 0) > giveMap.getOrDefault(now, 0) - getMap.getOrDefault(now, 0) ? 1 : 0);

                nextMap.put(now, nextMap.getOrDefault(now, 0) + nowIncrement);
                nextMap.put(other, nextMap.getOrDefault(other, 0) + otherIncrement);
            }
        }

        return nextMap.values().stream().max(Integer::compare).orElse(0);
    }
}
