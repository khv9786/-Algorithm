import java.util.*;

class Solution { // 6019. 기차 사이의 파리 D3

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
        	double D = sc.nextInt();
        	double A = sc.nextInt();
        	double B = sc.nextInt();
        	double F = sc.nextInt();
        	double answer = 0;
        	
        	answer = D / (A+B) * F;

            // 3. Output
            System.out.printf("#"+tc+" "+answer);
        }
    }
}
