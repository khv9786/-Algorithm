import java.util.*;

public class Main {
    public static void main(String[] args){
        //input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int [] fruit = new int[N];
        //logic
        for(int i = 0; i < N; i ++){
            fruit[i] = sc.nextInt();
        }
        Arrays.sort(fruit);
        
        for (int j = 0; j < N; j++) {
            if (L >= fruit[j]) {
                L++;
            } else {
                break;
            }
        }
        
        //output
        System.out.printf("%d",L);
    }
}
