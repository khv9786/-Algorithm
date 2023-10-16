import java.util.*;

public class Main { // 크로아디아 알파벳 44%
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // replace 메서드 사용하면 될듯,
        String [] cro = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String s = sc.nextLine();
//        int answer = 0;
        for(int i = 0; i<cro.length;i++) {
        	if(s.contains(cro[i])) {
        		s = s.replace(cro[i], "!");
//        		answer++;
        	}
        }
        // 문제 잘 읽기. 알파벳 수 출력임. *위 목록에 없는 알파벳은 한 글자씩 센다.
//        System.out.println(answer);
        System.out.println(s.length());
    }
}
