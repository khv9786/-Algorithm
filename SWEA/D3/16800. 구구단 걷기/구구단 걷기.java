import java.util.*;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            long N = sc.nextLong();
            long answer = 0;
            double sqrt = Math.sqrt(N); // N의 제곱근
            ArrayList<Long> arr = new ArrayList<>(); // 약수 받을 ArrayList

            for (long i = 1; i <= sqrt; i++) {
                if (N % i == 0) { // 약수 중 작은 수 저장
                    if (Math.pow(i, 2) == N) { // 제곱근 판단
                        arr.add(i);
                    } else {
                        arr.add(i);   // 작은 수 저장
                    }
                    // Calculate the larger factor once outside the if condition
                    long largerFactor = N / i;
                    if (largerFactor != i) {
                        arr.add(largerFactor); // 큰 수 저장
                    }
                }
            }
            Collections.sort(arr);
            if (arr.size() % 2 == 0) {
                answer = arr.get(arr.size() / 2) + arr.get(arr.size() / 2 - 1) - 2L;
            } else {
                answer = (long) (2 * sqrt) - 2L;
            }

            // if N = 10, 1,2,5,10. size() = 4. 따라서 1,2 idex를 더한 후 2빼면 된다.

            System.out.printf("#%d %d%n", test_case, answer);
        }
    }
}
