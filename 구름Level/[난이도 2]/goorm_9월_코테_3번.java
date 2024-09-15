import java.io.*;
import java.util.*;

public class goorm_9월_코테_3번 { // 코테, [난이도 2] 구름 RPG 2

    static boolean[] primeArr;
    static ArrayList<Integer> primeList = new ArrayList<>();

    static void isPrime(int n) {
        primeArr = new boolean[n + 1];
        Arrays.fill(primeArr, true);
        primeArr[0] = primeArr[1] = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primeArr[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primeArr[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primeArr[i]) {
                primeList.add(i);
            }
        }
    }

    // A보다 작거나 같은
    static int findBigPrime(int a) {
        int lowPrime = -1;
        for (int i = primeList.size() - 1; i >= 0; i--) {
            if (primeList.get(i) <= a) {
                lowPrime = primeList.get(i);
                break;
            }
        }
        return lowPrime;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        isPrime(100000);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(br.readLine());
            int closestPrime = findBigPrime(A);
            int cost = A - closestPrime;
            sb.append(cost).append("\n");
        }

        System.out.println(sb);
    }
}
