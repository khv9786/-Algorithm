import java.util.*;

public class Main { //  26069번 붙임성	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashSet<String> Danced = new HashSet<>();
		Danced.add("ChongChong");
		
		
		//input
		for(int tc = 1; tc <= N; tc++) {
			String A = sc.next();
			String B = sc.next();
			
			//logic 
			//A나 B가 춤추면 상대방을 Hash에 추가.
			if(Danced.contains(A)) {
				Danced.add(B);
			}else if(Danced.contains(B)) {
				Danced.add(A);
			}
		}
		
		int answer = Danced.size(); // 해시에 담긴 수 = 춤추는 사람
		// output
		System.out.println(answer);
	}
}