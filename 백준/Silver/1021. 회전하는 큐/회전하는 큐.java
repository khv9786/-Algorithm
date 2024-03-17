import java.io.*;
import java.util.*;

public class Main { // 1021 회전하는 큐
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;

        LinkedList<Integer> deq = new LinkedList<>();
        for(int  i = 1; i<=N; i++)
            deq.addLast(i);

        int[] find = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<M; i++)
            find[i] = Integer.parseInt(st.nextToken());

        for(int i = 0; i<M; i++){
            if(deq.getFirst() == find[i]){
                deq.removeFirst();
                continue;
            }

            int findIdx = deq.indexOf(find[i]);
            int backCnt = deq.size() - findIdx;

            if(findIdx < backCnt){
                while(deq.getFirst() != find[i]){
                    deq.addLast(deq.removeFirst());
                    cnt++;
                }
            }else{
                while(deq.getFirst() != find[i]){
                    deq.addFirst(deq.removeLast());
                    cnt++;
                }
            }

            deq.removeFirst();
        }

        System.out.println(cnt);
    }
}