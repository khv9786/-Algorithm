import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;

        for (int i = 1; i <= N; i++) {
            int a = sc.nextInt();
            if (a != i) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
