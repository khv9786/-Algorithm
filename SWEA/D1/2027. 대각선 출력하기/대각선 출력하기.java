import java.io.*;
import java.util.*;

class Solution { // 19113. 식료품 가게 D3
	public static void main(String args[]) throws Exception {

		StringBuilder sb = new StringBuilder();
		int idx = 0;
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				if (j == idx) {
					sb.append("#");
				} else {
					sb.append("+");
				}
			}
			idx++;
			sb.append("\n");
		}
		System.out.println(sb);
	}
}