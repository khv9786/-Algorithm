import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();

        int temp = 666;
        int answer = 1;
        // Logic 
        
        
        while(answer != N) {
			temp++;
			if(String.valueOf(temp).contains("666")) {
				answer++;
			}
		}
		System.out.println(temp);
               
        sc.close();
    }
}
// 앞에 숫자 추가 또는 후미에 추가는 귀찮네오..
//666
//1666
//~
//9666
//10666
//11666
//12
//13
//14
//15666
//16661
//~~~9
//17666
//18666
//19666
//20666
//~~~~
//25666
//26661