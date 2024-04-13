import java.io.*;
import java.util.*;

public class Main { //Boj_18870_좌표 압축
    static int N;
    static int [] arr,copy_arr;
    static Map<Integer, Integer> map = new HashMap<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        copy_arr = arr.clone();
        Arrays.sort(arr);
        int temp = 0;

        for(int i = 0; i<N; i++){
            if(map.containsKey(arr[i])) continue;
            map.put(arr[i], temp);
            temp ++;
        }

        for (int i = 0; i < N; i++) {
            sb.append(map.get(copy_arr[i])).append(" ");
        }

        System.out.println(sb);
    }
}