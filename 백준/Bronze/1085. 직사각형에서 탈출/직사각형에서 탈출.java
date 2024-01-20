import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int [4];
        for(int i = 0 ; i<4; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        int x = Math.min(arr[0],Math.abs(arr[2]-arr[0]));
        int y = Math.min(arr[1],Math.abs(arr[3]-arr[1]));
        int answer = Math.min(x, y);
             System.out.println(answer);
    }
}