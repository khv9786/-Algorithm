import java.util.*;

public class Main { // 2164 카드 2
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer> queue = new LinkedList<Integer>();

        // Input
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        // Logic
        while (queue.size() > 1) {
            queue.poll(); 
            int movedCard = queue.poll(); 
            queue.add(movedCard); 
        }

        // Output
        System.out.println(queue.poll());

        sc.close();
    }
}
