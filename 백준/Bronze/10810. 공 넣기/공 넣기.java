import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int [] basket = new int[N];
        int [] temp = new int[3];
        //logic
        for(int i = 0; i < M; i++){
            temp[0] = sc.nextInt();
            temp[1] = sc.nextInt();
            temp[2] = sc.nextInt();
            for(int j = temp[0]-1; j < temp[1]; j++){
                basket[j] = temp[2];
            }
        }


    for (int i = 0; i < basket.length; i++) {
        System.out.print(basket[i] + " ");
    }

    }
}