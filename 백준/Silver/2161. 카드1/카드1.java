import java.util.*;

public class Main { //2161번 카드1 68%
	// 큐 활용.
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		Queue<Integer> queue = new LinkedList<Integer>();	
		StringBuilder sb = new StringBuilder();
		
		// Input
		for (int i = 1; i <= n; i++) {			
			queue.add(i);
		}
		// logic
		while(!queue.isEmpty()){ // 한장빼고 모두 버릴 때 까지
			int p = queue.poll();
			sb.append(p);
			 if (!queue.isEmpty()) { // 카드가 남아있다면
	                sb.append(" ");
	                queue.add(queue.poll());
	            }
			
		}
		//output

		
		System.out.println(sb);
		sc.close();
	}// main	
}// solution