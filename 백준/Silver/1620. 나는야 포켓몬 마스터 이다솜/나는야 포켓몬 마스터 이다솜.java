import java.io.*;
import java.util.*;

public class Main { // S4 1620 나는야 포켓몬 마스터 다솜이
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> nameToNumber = new HashMap<>();
        HashMap<String, String> numberToName = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            String number = String.valueOf(i);
            nameToNumber.put(name, number);
            numberToName.put(number, name);
        }

        for (int i = 0; i < M; i++) {
            String cmd = br.readLine();
            if (nameToNumber.containsKey(cmd)) {
                sb.append(nameToNumber.get(cmd));
            } else {
                sb.append(numberToName.get(cmd));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
