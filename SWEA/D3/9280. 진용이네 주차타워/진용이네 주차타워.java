import java.util.*;

class Solution { // 9280. 진용이네 주차타워

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int spaces = sc.nextInt(); // 주차 공간 n
			int cars = sc.nextInt(); // 차량 수 m
			int parking_cost[] = new int[spaces];
			int parking_zone[] = new int[spaces];
			int car_W[] = new int[cars+1];
			
			int answer = 0;

			for (int i = 0; i < spaces; i++) {
				parking_cost[i] = sc.nextInt();
			}

			for (int i = 1; i <= cars; i++) {
				car_W[i] = sc.nextInt();
			}
			
			Queue<Integer> wait = new LinkedList<>();
			for (int i = 0; i < cars * 2; i++) {
				int in_car = sc.nextInt();
				// 들어오는 차량이면 큐에 추가.
				if (in_car > 0) {
					wait.add(in_car);
				}
				// 나가는 차량이면 주차장 자리 비우기
				if (in_car < 0) {
					int out_car = Math.abs(in_car);
					for (int full_num = 0; full_num < spaces; full_num++) {
						if (parking_zone[full_num] == out_car) {
							parking_zone[full_num] = 0;
						}
					}
				}
				for (int empty_num = 0; empty_num < spaces; empty_num++) {
					if (parking_zone[empty_num] == 0 && !wait.isEmpty()) {				
						int wait_car = wait.poll();
						parking_zone[empty_num] = wait_car;
						answer += parking_cost[empty_num] * car_W[wait_car];
						break;
					}
				}
			}

			// 3. Output
			System.out.println("#" + tc + " " + answer);
		}
	}
}
