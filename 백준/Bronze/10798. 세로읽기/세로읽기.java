import java.util.*;

public class Main {
    public static void main(String[] args) {
        // input
        try (Scanner sc = new Scanner(System.in)) {
            String[][] arr = new String[5][15];

            for (String[] row : arr) {
                Arrays.fill(row, "-1");
            }

            // logic
            int maxRow = 0;

            for (int tc = 0; tc < 5; tc++) {
                String str = sc.next();
                int rowLength = str.length();
                maxRow = Math.max(maxRow, rowLength);

                for (int i = 0; i < rowLength; i++) {
                    arr[tc][i] = String.valueOf(str.charAt(i));
                }
            }

            StringBuilder sb = new StringBuilder(maxRow);
            for (int i = 0; i < maxRow; i++) {
                for (int j = 0; j < 5; j++) {
                    if (!arr[j][i].equals("-1")) {
                        sb.append(arr[j][i]);
                    }
                }
            }

            // output
            String answer = sb.toString();
            System.out.println(answer);
        }
    }
}