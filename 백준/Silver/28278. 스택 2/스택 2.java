import java.util.*;

public class Main {
    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        // Logic
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    int x = sc.nextInt();
                    push(x);
                    break;
                case 2:
                    int popped = pop();
                    sb.append(popped).append("\n");
                    break;
                case 3:
                    int stackSize = size();
                    sb.append(stackSize).append("\n");
                    break;
                case 4:
                    int isEmpty = empty();
                    sb.append(isEmpty).append("\n");
                    break;
                case 5:
                    int top = top();
                    sb.append(top).append("\n");
                    break;
            }
        }

        // Output
        System.out.print(sb);
    }

    public static void push(int x) {
        stack.push(x);
    }

    public static int pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return -1;
    }

    public static int size() {
        return stack.size();
    }

    public static int empty() {
        if (stack.isEmpty()) {
            return 1;
        }
        return 0;
    }

    public static int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        return -1;
    }
}
