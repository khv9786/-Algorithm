class Solution {
    public int solution(String name) {
        int cost = 0;
        int n = name.length();
        int minMove = n - 1; // 최대 이동 횟수

        for (int i = 0; i < n; i++) {
            // 상하 조작 비용
            char c = name.charAt(i);
            cost += Math.min(c - 'A', 'Z' - c + 1);

            // 좌우 이동 비용 계산
            int next = i+1;
            while (next < n && name.charAt(next) == 'A') {
                next++;
            }

            // 정방향 vs 역방향 비교
            minMove = Math.min(minMove, i + n - next + Math.min(i, n - next));
        }

        cost += minMove;
        return cost;
    }
}