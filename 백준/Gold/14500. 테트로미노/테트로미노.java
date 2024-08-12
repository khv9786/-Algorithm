import java.io.*;
import java.util.*;

public class Main {// G4 테트로미노
    public static int N, M, max;
    public static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
//        algorithm(2, 2);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                algorithm(j, i);
            }
        }
        System.out.println(max);
    }

    public static void algorithm(int x, int y) {
        // 1자
        int[][][] block1 = {
                {{0, 1, 2, 3}, {0, 0, 0, 0}},
                {{0, 0, 0, 0}, {0, 1, 2, 3}}
        };
        // ㅁ 모양
        int[][][] block2 = {
                {{0, 1, 0, 1}, {0, 0, 1, 1}}
        };
        // L자
        int[][][] block3 = {
                {{0, 1, 2, 2}, {0, 0, 0, 1}}, // 아래 우측
                {{0, 1, 2, 2}, {0, 0, 0, -1}}, // 아래 좌측
                {{0, -1, -2, -2}, {0, 0, 0, 1}}, // 위 우측
                {{0, -1, -2, -2}, {0, 0, 0, -1}},  // 위 좌측
                {{0, 0, 0, -1}, {0, 1, 2, 2}}, //우측 위
                {{0, 0, 0, 1}, {0, 1, 2, 2}}, // 우측 아래
                {{0, 0, 0, -1}, {0, -1, -2, -2}}, // 왼쪽 위
                {{0, 0, 0, 1}, {0, -1, -2, -2}} // 왼쪽 아래
        };
        // 번개모양
        int[][][] block4 = {
                {{0, 1, 1, 2}, {0, 0, 1, 1}},   // 아래 우측
                {{0, 1, 1, 2}, {0, 0, -1, -1}}, // 아래 좌측
                {{0, -1, -1, -2}, {0, 0, 1, 1}}, // 위 우측
                {{0, -1, -1, -2}, {0, 0, -1, -1}}, // 위 좌측
                {{0, 0, -1, -1}, {0, 1, 1, 2}},   // 우측 아래
                {{0, 0, 1, 1}, {0, 1, 1, 2}}, // 우측 위
                {{0, 0, -1, -1}, {0, -1, -1, -2}}, // 좌측 위
                {{0, 0, 1, 1}, {0, -1, -1, -2}} // 좌측 아래
        };

        // 'ㅜ' 모양
        int[][][] block5 = {
                {{0, 0, 0, 1}, {0, 1, 2, 1}},  // 'ㅜ' 우측
                {{0, -1, -2, -1}, {0, 0, 0, 1}}, // 'ㅜ' 좌측
                {{0, 0, 0, 1}, {0, 1, 2, 1}},  // 'ㅗ' 우측
                {{0, 0, 0, -1}, {0, -1, -2, -1}},  // 'ㅗ' 왼쪽
                {{0, -1, -2, -1}, {0, 0, 0, -1}}, // 'ㅓ' 위쪽
                {{0, -1, -2, -1}, {0, 0, 0, 1}}, // 'ㅏ' 위쪽
                {{0, 1, 1, 2}, {0, 0, -1, 0}},  // 'ㅓ' 아래쪽
                {{0, 1, 2, 1}, {0, 0, 0, 1}}  // 'ㅏ' 아래쪽
        };

        int[][][][] blocks = {block1, block2, block3, block4, block5};

        for (int[][][] block : blocks) {
        for (int[][] shape : block) {
            int answer = 0;
            for (int k = 0; k < 4; k++) {
                int nx = x + shape[0][k];
                int ny = y + shape[1][k];
                if (range(nx, ny)) {
                    answer += arr[ny][nx];
                } else {
                    answer = 0;
                    break;
                }
            }
//            System.out.println("값 :" + answer + " x: " + x + ", y: " + y);
            max = Math.max(max, answer);
        }
//        System.out.println("블록 체인지");
        }
    }

    public static boolean range(int x, int y) {
        return x >= 0 && y >= 0 && x < M && y < N;
    }
}
