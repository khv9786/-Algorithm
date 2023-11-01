import java.util.*;

class Solution // Sweat 4406. 모음이 보이지 않는 사람
{
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		String [] aeiou = {"a","e","i","o","u"};
		String answer = "";
		for (int tc = 1; tc <= T; tc++) {
			String s = sc.nextLine();
			answer = s;
			for(int i = 0; i<aeiou.length; i++) {
				answer = answer.replaceAll(aeiou[i],"");
			}	
			System.out.printf("#%d %s\n", tc, answer);
		}
		

	}
}
