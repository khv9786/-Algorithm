class Solution {
    int answer = 0;

    public int solution(int[] info, int[][] edges) {
        boolean[] visit = new boolean[info.length]; 
        dfs(0, visit, 0, 0, info, edges);
        return answer;
    }

    private void dfs(int idx, boolean[] visit, int sheep, int wolf, int[] info, int[][] edges) {
        visit[idx] = true;

        if (info[idx] == 0) {
            sheep++;
            answer = Math.max(sheep, answer);
        } else {
            wolf++;
        }

        if (sheep <= wolf) {
            return;
        }

        for (int[] edge : edges) {
            if (visit[edge[0]] && !visit[edge[1]]) {
                // 새로운 경로를 이전 경로에서 복사해서 생성
                boolean[] newVisit = visit.clone();
                dfs(edge[1], newVisit, sheep, wolf, info, edges);
            }
        }
    }
}