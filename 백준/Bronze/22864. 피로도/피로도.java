import java.util.*;
import java.io.*;

public class Main { // 22864_피로도
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int Max_hour = 24;
		int time = 0;
		int rest = 0;
		int tired = 0;
		int answer = 0;
		
		while(time < Max_hour) {
			time ++;
			if(tired + A <= M) {
				answer += B ;
				tired += A;
			}else {
				tired -= C;
				if(tired < 0) {
					tired = 0;
				}
			}
		}
		
		System.out.println(answer);
	}
	
}
