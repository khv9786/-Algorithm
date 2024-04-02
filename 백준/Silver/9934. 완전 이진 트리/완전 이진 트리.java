import java.io.*;
import java.util.*;


public class Main { //Boj_9934_완전 이진 트리
    static int[] node;
    static List<Integer>[] answer;
    static int size, n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        size = (int) Math.pow(2, n) - 1;
        node = new int[size];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            node[i] = Integer.parseInt(st.nextToken());
        }

        answer = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            answer[i] = new ArrayList<>();
        }

        func(0, 0, size - 1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int temp : answer[i]) {
//                System.out.println("temp = " + temp);
                sb.append(temp).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

    static void func(int depth, int left, int right) {
        if (left > right) {
            return;
        }
        int mid = (left + right) / 2;

        answer[depth].add(node[mid]);
        // 양쪽 채우기,
        // 1 2 3 4 5 6 7
        // root = mid -> 4
        // 1~3 left 정리, 4~7 right 정리
        func(depth + 1, left, mid - 1);
        func(depth + 1, mid + 1, right);
    }
}