import java.util.*;

public class Main { //2161번 카드1 68%
	// 큐 활용.
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Queue<Integer> queue = new LinkedList<Integer>();	
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		int idx = 0;
		// Input
		for (int i = 1; i <= n; i++) {			
			queue.add(i);
		}
		// logic
		while(!queue.isEmpty()){
			idx ++;
			if(idx == k) {
				sb.append(queue.poll());
				idx = 0;
				if(!queue.isEmpty()) {
					sb.append(", ");
				}
			}else {
	                queue.add(queue.poll());
	            }
			
		}
		//output
		
		
		sb.append(">");
		System.out.println(sb);
		sc.close();
	}// main	
}// solution