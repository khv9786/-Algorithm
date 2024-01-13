import java.util.*;
import java.io.*;

public class Main {// Boj_11718_그대로출력하기

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
        	String s = br.readLine();
        	if(s == null) {
        		break;
        	}
        	System.out.println(s);
        }   
    }
}