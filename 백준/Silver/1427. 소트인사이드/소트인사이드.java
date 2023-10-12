import java.util.*;

public class Main { // 1427 소트인사이드
// 문자열로 받아서 크기 잡고, 배열로 10%로 넣고 sorting후 for문 통해 *10으로 출력
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //input
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int answer = 0;
        String s = (n + "");
        int [] arr = new int[s.length()]; 
        for(int i = 0; i < s.length();  i++) {
        	arr[i] = n % 10;
        	n /= 10;
        }
        Arrays.sort(arr);
        int idx = 1;
        for(int i = 0; i<arr.length; i++) {
        	answer += arr[i] * idx;
        	idx *= 10;
        }
        System.out.println(answer);
    }
}
