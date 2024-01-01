import java.io.*;
import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int Tc = 1; Tc <= T; Tc++) {
            StringBuilder sb = new StringBuilder();
            int N = sc.nextInt();

            Long[] answer = new Long[N]; 
            long[] num = new long[N * 2];
            boolean[] used = new boolean[N * 2];

            for (int i = 0; i < 2 * N; i++) {
                long temp = sc.nextLong();
                num[i] = temp;
                used[i] = true;
            }
            
            int idx = 0; 
            for (int i = 0; i < 2 * N; i++) {
                if (used[i]) {
                    long cur = num[i];
                    for (int j = i; j < 2 * N; j++) {
                        long before = cur * 4 / 3;
                        if (num[j] == before && used[j]) {
                            answer[idx] =  cur; 
                            used[j] = false;
                            used[i] = false;
                            idx++;
                            break;
                        }
                    }
                }
            }
            
            sb.append("#" + Tc + " ");
            for (Long a : answer) {
                sb.append(a + " ");
            }
            System.out.println(sb);
        }
    }
}