import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int tc = 1; tc <= N; tc++) {
            String answer = "yes";
            String S = sc.next();
            String T = sc.next();

            // 두 문자열이 무한히 반복되어서 만들어진 문자열인지 확인
            int lcm = lcm(S.length(), T.length()); // 최소공배수 계산
            String repeatedS = repeatString(S, lcm/S.length());
            String repeatedT = repeatString(T, lcm/T.length());

            if (!repeatedS.equals(repeatedT)) {
                answer = "no";
            }

            // Output
            System.out.printf("#%d %s%n", tc, answer);
        }
    }

    // 최소공배수를 계산하는 함수
    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // 최대공약수를 계산하는 함수
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 문자열을 지정된 횟수만큼 반복하는 함수
    private static String repeatString(String str, int times) {
        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < times; i++) {
            repeated.append(str);
        }
        return repeated.toString();
    }
}
