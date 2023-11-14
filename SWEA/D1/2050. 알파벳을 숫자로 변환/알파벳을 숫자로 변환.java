import java.io.*;
import java.util.*;

class Solution { // swea 2050. 알파벳을 숫자로 변환
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);	
		
		String s = sc.next();
		int arr [] = new int [s.length()];
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<s.length(); i++) {
			sb.append(s.charAt(i) - 'A' + 1);
			sb.append(" ");
		}
		System.out.println(sb);
		
	}

}
