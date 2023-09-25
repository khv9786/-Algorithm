import java.util.*;

class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        // Input
        int days[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int[] YMD = new int[3];
			YMD [0] =N / 10000;
            YMD [1] =(N-YMD[0] * 10000)/100;
            YMD [2] =N % 100;
            int answer = -1;


            // Logic && Output
            if (1 <= YMD[1] && YMD[1] <= 12 && 1 <= YMD[2] && YMD[2] <= days[YMD[1]]) {
                System.out.printf("#%d %04d/%02d/%02d\n", tc, YMD[0], YMD[1], YMD[2]);
            } else {
                System.out.printf("#%d %d\n", tc, answer);
            }
        }
    }
}
