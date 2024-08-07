import java.io.*;
import java.util.*;

public class Main { // S2 잃어버린 괄호
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stSub = new StringTokenizer(br.readLine(), "-");
        int result = 0;

        // 첫 번째 부분을 처리
        if (stSub.hasMoreTokens()) {
            String firstPart = stSub.nextToken();
            result = addPart(firstPart);
        }

        while (stSub.hasMoreTokens()) {
            String nextPart = stSub.nextToken();
            result -= addPart(nextPart);
        }

        System.out.println(result);
    }

    private static int addPart(String part) {
        StringTokenizer stAdd = new StringTokenizer(part, "+");
        int sum = 0;
        while (stAdd.hasMoreTokens()) {
            sum += Integer.parseInt(stAdd.nextToken());
        }
        return sum;
    }
}
