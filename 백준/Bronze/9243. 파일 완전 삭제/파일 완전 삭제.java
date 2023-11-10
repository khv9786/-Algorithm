import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();

        boolean suc = true;

        for (int i = 0; i < s1.length(); i++) {
            int a = Character.getNumericValue(s1.charAt(i));
            int b = Character.getNumericValue(s2.charAt(i));

            if (n % 2 == 1) {
                if (a + b != 1) {
                    suc = false;
                    break;
                }
            } else {
                if (a - b != 0) {
                    suc = false;
                    break;
                }
            }
        }

        if (suc) {
            System.out.println("Deletion succeeded");
        } else {
            System.out.println("Deletion failed");
        }
    }
}
