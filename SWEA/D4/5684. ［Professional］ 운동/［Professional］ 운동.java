import java.util.*;

class Solution {
	static int N, M, answer;
	static int[][] map;

	public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {

            N = sc.nextInt(); // 건물
            M = sc.nextInt(); // 도로 (간선)
            map = new int[N+1][N+1]; // 간선번호 그대로 사용
            for (int i = 1; i <= M; i++) {
            	//map에 정점, 간선, 거리 정리
                map[sc.nextInt()][sc.nextInt()] = sc.nextInt();
            }
            answer = Integer.MAX_VALUE;
            // 모든 정점에서 시작
            for (int i = 1; i <= N; i++) {
                bfs(i);
            }
            if(answer ==  Integer.MAX_VALUE){
            	answer =-1;
            }
                
            System.out.printf("#%d %d\n",tc,answer);
        }
    }

	private static void bfs(int start) {
        boolean visit[] = new boolean[N+1];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {start, 0});
        while (!q.isEmpty()) {
            int[] cur = q.poll(); //cur[0] = 시작노드, cur[1] = 거리
            for (int i = 1; i <= N; i++) {
            	// 만약 연결되어있고, 방문하지 않았다면
                if (map[cur[0]][i] != 0 && !visit[i]) {
                    visit[i] = true;
                    // 현재 거리 + 이동하는데 거리
                    q.add(new int[] { i, cur[1] + map[cur[0]][i] });
                }
                // 만약 다시 돌아오는 거리가 최단거리라면 저장.
                if (map[cur[0]][i] != 0 && i == start) {
                	//System.out.println("방문 : "+i+" 값 : "+(cur[1] + map[cur[0]][i]));
                    if (answer > cur[1] + map[cur[0]][i])
                        answer = cur[1] + map[cur[0]][i];
                    return;
                }
            }
        }//while
    }
}