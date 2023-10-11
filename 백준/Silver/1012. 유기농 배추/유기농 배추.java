import java.util.*;

public class Main { // 1012 유기농 배추 37%
	// bfs
	// 먼저 연결을 정리하고, 연결된 곳을 다 확인 후 answer ++
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //input
        for(int tc = 1; tc<= t; tc++) {
        	
        	int [] dx = {-1,0,1,0}; //왼 상 우 하 
        	int [] dy = {0,1,0,-1}; 
        	
        	int M = sc.nextInt(); // 가로
        	int N = sc.nextInt(); // 세로
        	int K = sc.nextInt(); // 배추 수
        	int [][] bat = new int[M][N];
        	boolean [][] visit = new boolean[M][N];
        	int bug = 0; // answer
        	//배추 input
        	for(int baechu = 0; baechu < K; baechu++) {
        		int x = sc.nextInt();
        		int y = sc.nextInt();
        		bat[x][y] = 1;
        	}
        	//logic
        	for(int i = 0; i<M; i++) {
        		for(int j = 0; j<N; j++) {
        			if(!visit[i][j] && bat[i][j] == 1) { 
        				// 방문하지 않았고 배추가 있는곳에 벌레두기
        				bug ++;
        				//BFS       				
        				Queue<int[]> que = new LinkedList<>();
        				que.add(new int [] {i,j}); // 현재 위치 넣기
        				visit[i][j] = true;
        				
        				while(!que.isEmpty()) {
        				    int i2 = que.peek()[0]; //x좌표
        				    int j2 = que.poll()[1]; //y좌표
        				    // 상하좌우
        					for(int k = 0; k<4; k++) {
        						int ix = i2 + dx[k]; // ix iy -> 범위 x,y
        						int iy = j2 + dy[k]; 
        						// 범위 체크
        						if(ix >= 0 && ix < M && iy >= 0 && iy < N){
        							// 방문하지 않았고, 배추라면
        							if(!visit[ix][iy] && bat[ix][iy] == 1) { 
        								
        								que.add(new int[] {ix,iy}); // 현재 위치 큐에 넣기
        								visit[ix][iy] = true; // 방문함으로 체크
        							}
        							
        						}
        					}
        				}
        				
        			}
        		}// Output
        	}System.out.println(bug);
        	
        	
        }//tc
        sc.close();
    }
}
