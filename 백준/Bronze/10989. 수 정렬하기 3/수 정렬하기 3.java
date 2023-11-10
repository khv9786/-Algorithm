import java.io.*;
 
public class Main { // 10989번 수 정렬하기 3
    public static void main(String[] args) throws IOException {

        int[] num = new int[10001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int N = Integer.parseInt(br.readLine());
 
        for (int i = 0; i < N; i++) {
            num[Integer.parseInt(br.readLine())] ++;
        }
 
        br.close();
 
        StringBuilder sb = new StringBuilder();
 
        for(int i = 1; i < 10001; i++){
            while(num[i] > 0){
                sb.append(i).append('\n');
                num[i]--;
            }
        }
        System.out.println(sb);
    }
}