import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution // Sweat 17643. 로봇 D4
{
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long tmp = 1;
		long Max;
		
		String answer = "";
		
		for (int tc = 1; tc <= T; tc++) {
			tmp = 1;
			answer ="no";
			long sum = 0;
			int a = Math.abs(sc.nextInt());
			int b = Math.abs(sc.nextInt());
			Max = makeMax(a,b);
			// a와 b
			if (a != 0 || b != 0) {
				while (tmp <= Max) {
					sum += tmp;
					// 최대 크기 보다 a와 b가 작으면 설정 완료.
					if (a <= sum && b <= sum) {
						break;
					}
					tmp *= 3L;
				}

				while (tmp >= 1L) {
					a = Math.abs(a);
					b = Math.abs(b);
					// a와 b중 큰 값에서 빼주기.
					if (a > b) {
						a -= tmp;
					} else {
						b -= tmp;
					}
					tmp /= 3;
				}
			}
			if(a ==0 && b== 0) {
				answer = "yes";
			}
			System.out.printf("#%d %s\n", tc, answer);
		}
		

	}
	public static long makeMax (int a, int b) {
        long num = a+b;
        int power = 0;
        long result = 1;

        while (result < num) {
            result *= 3;
            power++;
        }
		return result;
    }
}
