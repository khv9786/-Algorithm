import java.util.*;

public class Main {
    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[5][15];

        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(arr[i], "-1");
        }

        // logic
        int maxRow = 0; 

        for (int tc = 0; tc < 5; tc++) {
            String str = sc.next();
            int RowLength = str.length();
            maxRow = Math.max(maxRow, RowLength); 

            for (int i = 0; i < RowLength; i++) {
                arr[tc][i] = String.valueOf(str.charAt(i));
            }
        }


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxRow; i++) { 
            for (int j = 0; j < 5; j++) { 
                if (!arr[j][i].equals("-1")) {
                    sb.append(arr[j][i]);
                } else {
                }
            }
        }

        // output
        String answer = sb.toString();

        System.out.println(answer);
        sc.close();
    }
}
