import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // Line으로 받아서 n m 을 토큰으로 받아줌
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // Input
        // 먼저 M 미만은 무시하고, 리스트에 저장, 정렬 후 빈도수 및 길이 비교로 재정렬
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = bf.readLine();
            if (!(str.length() < m)) {
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        // 리스트에 단어 넣어두기
        List<String> word = new ArrayList<>(map.keySet());

        // 우선 순위에 따라 비교 람다 활용해서 compareTo 구현
        word.sort((o1, o2) -> {
            int c1 = map.get(o1); // 빈도수
            int c2 = map.get(o2); // 빈도수

            if (c1 == c2) { // 빈도수가 같은경우
                if (o1.length() == o2.length()) { //단어 길이가 같은경우
                    return o1.compareTo(o2); //알파뱃 순서로
                }
                return o2.length() - o1.length(); //단어가 길수록 앞에 위치
            }
            return c2 - c1; //빈도수가 높은 단어가 앞으로
        });

        // 출력
        for(int i = 0; i < word.size(); i++){
            bw.write(word.get(i) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
