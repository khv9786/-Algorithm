import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String result = "";
        
		for(char ch : str.toCharArray()) {
        
			if(Character.isLowerCase(ch)) {
				result += Character.toUpperCase(ch);
			} else {
				result += Character.toLowerCase(ch);
			}
            
		}
		System.out.println(result);
	}
}