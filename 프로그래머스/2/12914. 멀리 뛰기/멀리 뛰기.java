class Solution { // dp로 해결
    public static long solution(int n) {
        long[] d = new long[n + 1];

        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        d[0] = 0;
        d[1] = 1;
        d[2] = 2;

        for (int i = 3; i <= n; i++) {
            d[i] = (d[i - 1] + d[i - 2]) % 1234567;
        }

        return d[n];
    }
}