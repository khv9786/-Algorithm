import java.io.*;
import java.util.*;

public class Main { // S4 식당 메뉴

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());

        Queue<int []> stuQue = new ArrayDeque<>();
        Queue<Integer> menuQue = new ArrayDeque<>();

        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            if(cmd == 1){
                int stuNum = Integer.parseInt(st.nextToken());
                int wannaMenuNum = Integer.parseInt(st.nextToken());
                stuQue.offer(new int[]{stuNum, wannaMenuNum});
            }else if(cmd == 2){
                int menuNum = Integer.parseInt(st.nextToken());
                menuQue.offer(menuNum);
            }
        }

        List<Integer> happyStu = new ArrayList<>();
        List<Integer> unhappyStu = new ArrayList<>();
        List<Integer> hungry = new ArrayList<>();

        while(!stuQue.isEmpty()){
            if(menuQue.isEmpty()){
                // 메뉴를 못 먹을때
                while(!stuQue.isEmpty()){
                    int [] stu = stuQue.poll();
                    hungry.add(stu[0]);
                }
                break;
            }
            int [] stu = stuQue.poll();
            int menuNum = menuQue.poll();

            if(stu[1] == menuNum){
                happyStu.add(stu[0]);
            }else{
                unhappyStu.add(stu[0]);
            }
        }

        if(happyStu.isEmpty()){
            sb.append("None").append("\n");
        } else {
            Collections.sort(happyStu);
            for(int student : happyStu){
                sb.append(student).append(" ");
            }
            sb.append("\n");
        }

        if(unhappyStu.isEmpty()){
            sb.append("None").append("\n");
        } else {
            Collections.sort(unhappyStu);
            for(int student : unhappyStu){
                sb.append(student).append(" ");
            }
            sb.append("\n");
        }

        if(hungry.isEmpty()){
            sb.append("None").append("\n");
        } else {
            Collections.sort(hungry);
            for(int student : hungry){
                sb.append(student).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
