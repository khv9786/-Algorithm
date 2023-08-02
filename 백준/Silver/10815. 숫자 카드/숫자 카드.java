import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] N_arr = new int[N];
        HashSet<Integer> N_set = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            N_arr[i] = sc.nextInt();
            N_set.add(N_arr[i]);
        }
        
        int M = sc.nextInt();
        int[] M_arr = new int[M];
        for (int i = 0; i < M; i++) {
            M_arr[i] = sc.nextInt();
        }
        sc.close();

        // Logic
        for (int i = 0; i < M_arr.length; i++) {
            if (N_set.contains(M_arr[i])) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}
