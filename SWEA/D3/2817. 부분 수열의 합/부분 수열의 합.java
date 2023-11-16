import java.util.Scanner;

class Solution {
    static int N, K, countK;
    static int[] arr;
    
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
            N = sc.nextInt();			// 원소 개수
            K = sc.nextInt();			// 부분집합의 합
            arr = new int[N];
            for(int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();	// 수열 입력받기
            }
            countK = 0;
            powerset(0, 0);
            
            System.out.println("#" + test_case + " " + countK);
		}
	}
    static void powerset(int idx, int sum) {
        if(idx == N) {					// 수열을 전부 체크했을 때
        	if(sum == K) countK++;		// 부분집합의 합이 K와 같으면
            return;
        } else {
            // 부분집합에 포함시키지 않음 -> 더하지 않음
            powerset(idx + 1, sum);
            // 부분집합에 포함시킴 -> 더함
            sum += arr[idx];
            powerset(idx + 1, sum);
        }
    }
}