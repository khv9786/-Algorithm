import java.util.*;

public class Main { // 2606 바이러스 45%
	// bfs인듯??
	// 먼저 연결을 정리하고, 연결된 곳을 다 확인 후 answer ++
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 컴퓨터 수
        int y = sc.nextInt(); // 간선 수
        int answer = 0;
        
        Queue<Integer> queue = new LinkedList<Integer>();
        int [][] com = new int [x+1][x+1];
        boolean [] visit = new boolean[x+1];
        // Input
        for (int i = 1; i <= y; i++) { // 연결성 입력
            int a = sc.nextInt();
            int b = sc.nextInt();
            com[a][b] = 1;
            com[b][a] = 1;
        }
        
        // Logic       
        queue.add(1); // 시작 root 넣기
        
        
        while(!queue.isEmpty()) {
        	int node = queue.poll();
        	visit[node] = true;
        	for(int i = 1; i<=x; i++) { // x+1 이 아니었네.. x수 까지기 때문
        		if(!visit[i] && com[node][i] == 1) { // 방문 못했고, 연결되어 있다면
        			queue.add(i); // 추가
        			visit[i] = true; // 방문했습니다~
        			answer ++; // 값 추가
        		}
        	}
        }
        
        // Output
        System.out.println(answer);

        sc.close();
    }
}
