import java.io.*;
import java.util.*;

public class Main { // Boj_16165_걸그룹 마스터 준석이
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, String> memberToGroup = new HashMap<>();
        Map<String, TreeSet<String>> groupToMembers = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String group = br.readLine();
            int memberCount = Integer.parseInt(br.readLine());
            groupToMembers.put(group, new TreeSet<>());

            for (int j = 0; j < memberCount; j++) {
                String member = br.readLine();
                memberToGroup.put(member, group);
                groupToMembers.get(group).add(member);
            }
        }

        for (int i = 0; i < M; i++) {
            String query = br.readLine();
            String cmd = br.readLine();

            if (cmd.equals("1")) {
                sb.append(memberToGroup.get(query)).append("\n");
            } else if (cmd.equals("0")) {
                for (String member : groupToMembers.get(query)) {
                    sb.append(member).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}