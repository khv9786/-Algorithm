import java.io.*;
import java.lang.reflect.Member;
import java.util.*;

public class Main { // S5 10814 나이 순 정렬
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        Member[] member = new Member[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            member[i] = new Member(age, name);
        }

        // 나이 순으로 오름차순 정렬
        Arrays.sort(member, Comparator.comparingInt(o -> o.age));

        for(Member m : member){
            sb.append(m.age).append(" ");
            sb.append(m.name).append("\n");
        }
        System.out.println(sb);
    }

    public static class Member {
        int age;
        String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}
