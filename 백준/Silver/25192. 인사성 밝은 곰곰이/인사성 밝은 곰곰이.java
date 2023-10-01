import java.util.*;

public class Main { // 25192번 인사성 밝은 곰곰이
	public static void main(String[] args) throws Exception {
		// 닉네임을 Hash에 넣고, 중복되지 않으면 cnt ++
		// Enter가 들어오면 Hash 초기화 후 반복.
		// 복잡하다면 처음껄 함수로 빼면 될듯듯
		Scanner sc = new Scanner(System.in);
		HashSet<String> Chat = new HashSet<>();
		int K = sc.nextInt();
		int answer = 0;
		sc.nextLine(); // K 뒤 공백이 있었네..
		//input 
		for(int tc = 1; tc <= K; tc++) {
			String str = sc.nextLine();			
			if(str.equals("ENTER")) { // == 안쓰도록 주의.
				Chat.clear();
			}else if(!Chat.contains(str)){
				Chat.add(str);
				answer ++;
			}						
		}
		
		// output
		System.out.println(answer);
	}		
}