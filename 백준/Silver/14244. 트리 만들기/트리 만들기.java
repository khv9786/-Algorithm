import java.io.*;
import java.util.*;

class Main { // Boj_14244_트리 만들기

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 길이
        int M = Integer.parseInt(st.nextToken()); // 교환 횟수

        int leaf = 0; // 현재 리프의 개수
        if (M == 2) {
            leaf = 1; // 중심 노드를 리프로 포함
        }

        int lastLeaf = 0; // 마지막으로 추가된 리프 노드
        for (int i = 1; i < N; i++) {
            if (M > leaf) {
                System.out.println(0 + " " + i);
                leaf += 1;
            } else {
                System.out.println(lastLeaf + " " + i);
            }
            lastLeaf = i;
        }
    }
}

