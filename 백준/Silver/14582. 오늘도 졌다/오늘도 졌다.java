import java.util.Scanner;

public class Main {// 14582번 로또 구현

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr1 = new int[9];

		for (int i = 0; i < 9; i++) {
			arr1[i] = sc.nextInt();
		}
		int sum1 = 0;
		int sum2 = 0;
		String s = "No";
		for (int i = 0; i < 9; i++) {
			sum1 += arr1[i];
			if (sum1 > sum2) {
				s = "Yes";
				break;
			}
			sum2 += sc.nextInt();
			if (sum1 > sum2) {
				s = "Yes";
				break;
			}
		}
		System.out.println(s);
	}
}
