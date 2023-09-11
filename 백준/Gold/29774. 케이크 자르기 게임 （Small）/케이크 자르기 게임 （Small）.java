import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int a = 2;
        int b = 2;
        int n = 1;

        boolean isAlice = true;

        while (true) {
            if (a <= k && k <= b) break;

            int temp = a;
            a = b + 1;
            b = temp + (++n);

            isAlice = !isAlice;
        }

        System.out.println(isAlice ? 'A' : 'B');
    }
}
