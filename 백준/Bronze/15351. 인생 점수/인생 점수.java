import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for(int tc = 0; tc<N; tc++) {
        	String s = sc.nextLine();
        	s = s.replaceAll(" ", "");
        	int answer = 0;
        	for(int i = 0; i<s.length(); i++) {
        		answer += (s.charAt(i)-'A' +1);
        	}
        	if(answer == 100) {
        		System.out.println("PERFECT LIFE");
        	}else {
        		System.out.println(answer);
        	}

        }

        

        
    }
}
