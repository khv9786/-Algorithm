import java.io.*;
import java.util.*;

public class Main { // S4 로프

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int maxWeight = 0;
        Integer[] nums = new Integer[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(nums, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            maxWeight = Math.max(maxWeight, nums[i] * (i + 1));
        }

        System.out.println(maxWeight);
    }
}
