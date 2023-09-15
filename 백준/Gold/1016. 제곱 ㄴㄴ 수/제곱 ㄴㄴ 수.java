import java.util.*;

public class Main { //  1016번 백준 제곱근 ㄴㄴ
	public static void main(String[] args) throws Exception {
		//input
		Scanner sc = new Scanner(System.in);
		long min = sc.nextLong();
		long max = sc.nextLong();
		long size = max-min + 1; // 범위 설정
		boolean[] prime = new boolean[(int)size];
		long i = 2;
		
		//logic
		while (i * i <= max) {
			long sqrt = i * i; // 제곱근
			int correction = 0; // 보정값
			if (min % sqrt != 0) { // 제곱근으로 나눠지지 않는다면
				correction = 1;
			}
			
			long data = (min / sqrt) + correction;
			while (sqrt * data <= max) { // 소수 판별
				if (!prime[(int)(sqrt * data - min)]) {
					prime[(int)(sqrt * data - min)] = true;
					size -= 1; // 소수 개수 판별
				}
				data += 1;
			}
			
			i += 1;
		}
		// output
		System.out.println(size);
	}
}