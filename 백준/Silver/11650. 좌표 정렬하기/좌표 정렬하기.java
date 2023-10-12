import java.util.*;

public class Main { // 11650번 좌표정렬 47%
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2차원 배열 정리하는법 배우기.
        int N = sc.nextInt();
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i][0] = x;
            arr[i][1] = y;
        }
        Arrays.sort(arr, new Comparator<int []>(){ // *방식 익혀두기!*
        	@Override // Comparator 인터페이스 구현 후 compare 메서드를 수정하기 위함
        	public int compare(int[] o1, int[] o2) { // o1 -> 첫번째 요소 o2 -> 두번째 요소
        		if(o1[0] == o2[0]) { // 만약 arr[0]끼리 같다면
        			return Integer.compare(o1[1],o2[1]); // arr[0][1] 을 compare에 넣음
        		}else {
        			return Integer.compare(o1[0],o2[0]); // 아니라면 arr[0] 값 비교 1차원 배열 정렬
        		}        	
        	}
        });

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
