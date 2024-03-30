import java.io.*;
import java.util.*;

public class Main { // Boj_2002_추월
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        Map<String, Integer> entering_List = new HashMap<>();
        List<String> outgoing_Order = new ArrayList<>();

        for (int i = 1; i <= N; i++) { // 대근 입구
            String car = br.readLine();
            entering_List.put(car, i);
        }
        for (int i = 1; i <= N; i++) { // 영식 출구
            String car = br.readLine();
            outgoing_Order.add(car);
        }

        // 추월 => 자신의 입장 순서보다 출장 순서가 더 뒤인 경우를 찾습니다.
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                // 입장 순서를 비교합니다.
                if (entering_List.get(outgoing_Order.get(i)) > entering_List.get(outgoing_Order.get(j))) {
                    answer++;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}