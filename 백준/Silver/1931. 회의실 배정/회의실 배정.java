import java.io.*;
import java.util.*;

public class Main { // S1 회의실 배정

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int answer = 0;

        int [][] nums = new int[N][2];

        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            nums[i][0] = a;
            nums[i][1] = b;
        }

        Arrays.sort(nums,(o1,o2) -> {
            if(o1[1] == o2[1]){
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        int now = 0;

        for(int i = 0; i<N; i++) {
            if (now <= nums[i][0]) {
                now = nums[i][1];
                answer++;
            }
        }

        System.out.println(answer);

    }
}
