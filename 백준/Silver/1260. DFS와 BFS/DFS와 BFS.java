import java.util.*;

public class Main { // 1260 DFS와 BFS 37%
	// 정점 번호가 작은것부터 먼저 방문해야함 -> sorting 필요할듯?
	
	static ArrayList<Integer> [] Node ;
	static boolean[] chk ;
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt(); // 시작할 정점
		
		Node = new ArrayList[n+1]; // 1부터 시작이라
		chk = new boolean[n+1];
		
		// Input
		for (int i = 1; i <= n; i++) {			
			Node[i] = new ArrayList<Integer>();	
		}
		
		for(int i = 0; i< m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			Node[x].add(y); //연결
			Node[y].add(x);
		}
		
		// sort은 연결된 번호별로 해야해서 for문 사용 *기억할것
		for(int i = 1; i<Node.length; i++) {
			Collections.sort(Node[i]);
		}
		
		dfs(v);
		Arrays.fill(chk, false); // bfs를 위해 초기화
		System.out.println("");
		bfs(v);
		
		sc.close();
	}// main
	
	// Function
	static void dfs(int v) {
		chk[v] = true; // 현 위치 출력.		
		// Output
		System.out.printf(v + " ");
		for(int i = 0; i < Node[v].size(); i++) {
			if(chk[Node[v].get(i)] == false) { // 방문하지 않았다면 재귀로 방문.
				dfs(Node[v].get(i));
			}
		}
		
	}
	
	static void bfs(int v) {
		Queue<Integer> queue = new LinkedList<Integer>(); // 큐 선언
		queue.add(v); //시작 root 넣기
		chk[v] = true;
		
		while(!queue.isEmpty()) {
			int p = queue.poll();
			// Output
			System.out.printf(p + " "); // 방문한 노드 출력
			for(int i = 0; i < Node[p].size(); i++) {
				if(chk[Node[p].get(i)] == false) {
					chk[Node[p].get(i)] = true;
					queue.add(Node[p].get(i)); // 방문안한 모든 노드 큐에 넣기
				}
			}
		}
		
	}
}// solution