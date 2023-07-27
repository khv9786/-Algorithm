import java.util.*;

public class Main {
	public static void main(String[] args) {
		// input
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		sc.nextLine();
		int answer = tc;

		// logic
		for (int i = 0; i < tc; i++) {
			String S = sc.nextLine();
			boolean[] alpha = new boolean[26];

			
			for (int j = 0; j < S.length(); j++) {
				if (alpha[S.charAt(j) - 'a'] == false) { //처음 나온다면
					alpha[S.charAt(j) - 'a'] = true;
				}else if (S.charAt(j) != S.charAt(j-1) && j > 0) { // 처음이 아니고 연속되지 않는다면					
					answer --;
					break;					
				}
			}
		}

		// output
		System.out.println(answer);
		sc.close();

	}

}