import java.util.*;

public class Main { // 카드 셋트
	// P,K,H,T -> 0,100,200,300

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int arr[] = { 13, 13, 13, 13 };
		List<Integer> card = new ArrayList<>();
		Set<Integer> duplicated = new HashSet<>();
		boolean chk = true;
		for (int i = 0; i < s.length() - 2; i += 3) {
			int trump = 0;
			if (s.charAt(i) - 'P' == 0) {
				arr[0]--;
				trump = 0;
			} else if (s.charAt(i) - 'K' == 0) {
				arr[1]--;
				trump = 100;
			} else if (s.charAt(i) - 'H' == 0) {
				arr[2]--;
				trump = 200;
			} else if (s.charAt(i) - 'T' == 0) {
				arr[3]--;
				trump = 300;
			}
			int temp = trump + (10 * s.charAt(i + 1) - '0') + s.charAt(i + 2) - '0';
			card.add(temp);
			duplicated.add(temp);
			if (card.size() != duplicated.size()) {
				System.out.println("GRESKA");
				chk = false;
				break;
			}
		}
		if (chk) {
			for (int i = 0; i < arr.length; i++) {

				if (i == arr.length - 1) {
					System.out.print(arr[i]);
				} else {
					System.out.print(arr[i] + " ");
				}
			}
		}
	}
}
