import java.io.*;
import java.util.*;

public class Main { // 음계
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean up = false;
        boolean down = false;
        int x = Integer.parseInt(st.nextToken());
        for (int i = 0; i < 7; i++) {
            int now = Integer.parseInt(st.nextToken());
            if(x > now){
                down = true;
            }else if (x < now){
                up = true;
            }
            x = now;
        }

        if(up && down){
            System.out.println("mixed");
        }else if (up){
            System.out.println("ascending");
        }else{
            System.out.println("descending");
        }

    }
}
