import java.util.*;

class Solution {

    public static int result;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int number = sc.nextInt();
            int cnt = sc.nextInt();

            int[] numbers = new int[6]; 
            int len = 0;
            while (number > 0) {
                numbers[len++] = number % 10;
                number /= 10;
            }

            result = 0;
          
            if (len < cnt)
                cnt = len;
            dfs(cnt, 0, numbers, len);

            // 3. Output
            System.out.printf("#%d %d%n", test_case, result);
        }
    }

    public static void dfs(int cnt, int start, int[] numbers, int len) {
        //Base case
        if (cnt == 0) {
            int current = arrToInt(numbers, len);
            if (current > result) {
                result = current;
            }
            return;
        }

        for (int i = start; i < len - 1; ++i) {
            for (int j = i + 1; j < len; ++j) {
                swap(numbers, i, j);
                dfs(cnt - 1, i, numbers, len);
                swap(numbers, i, j);
            }
        }
    }


    public static int arrToInt(int[] numbers, int len) {
        int result = 0;
        for (int i = len - 1; i >= 0; i--) {
            result = result * 10 + numbers[i];
        }
        return result;
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
