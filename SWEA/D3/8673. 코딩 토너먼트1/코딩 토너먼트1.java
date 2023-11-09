import java.util.*;

class Solution { // 2805. 농작물 수확하기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int answer = 0;
		int K = 0;

		for (int tc = 1; tc <= T; tc++) {
			answer = 0;
			K = sc.nextInt();
			List<Integer> list = new ArrayList<>();
			List<Integer> temp = new ArrayList<>();
			int A = (int) Math.pow(2,K);
			for(int i = 0; i<A; i++) {
				list.add(sc.nextInt());
			}
			
			while(list.size() > 1) {
				for(int i = 0; i<list.size(); i += 2) {
					if(i+1 < list.size()) {
						int a = list.get(i);
						int b = list.get(i+1);
						int next = Math.max(a, b);
						temp.add(next);
						answer += Math.abs(a-b);
					}				
				}
				list.clear();
				for(int i = 0; i<temp.size(); i++) {
					list.add(temp.get(i));
				}
				temp.clear();
			}
			
		System.out.println("#"+tc+" "+answer);
		}
	}
}
