import java.util.*;

class Solution {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		sc.nextLine();

		for (int test_case = 1; test_case <= T; test_case++) {
			int answer = 0;
			String grass = sc.nextLine();
			Stack<Character> stack = new Stack<>();

			// Logic
			for (int i = 0; i < grass.length(); i++) {
				char c = grass.charAt(i);
				if (c == '(') {
					stack.push(c);
				} else if (c == ')') {
					if ((!stack.isEmpty() && stack.peek() == '(') || (!stack.isEmpty() && stack.peek() == '|')) {
						stack.pop();
						answer++;
					}
				} else if (c == '|') {
					if (!stack.isEmpty() && stack.peek() == '(') {
						stack.pop();
						answer++;
					} else {
						stack.push(c);
					}
				} else if (c == '.') {
				} else
					break;
			}
			// output
			System.out.printf("#%d %d%n", test_case, answer);
		}
	}
}
