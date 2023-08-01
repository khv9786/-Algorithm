import java.util.*;

public class Main {
	public static void main(String[] args) {
		// input
		Scanner sc = new Scanner(System.in);
		double sum_credits = 0;
		double sum_grade = 0;
		double answer = 0.000000;
		String grade = "";
		String [][] point = {{"A+","4.5"},{"A0","4.0"},{"B+","3.5"},{"B0","3.0"},{"C+","2.5"},{"C0","2.0"},{"D+","1.5"},{"D0","1.0"},{"F","0.0"}}; 

		// logic		
		for(int tc = 1; tc <= 20; tc++)
		{
			sc.next();
			double credits = sc.nextDouble();
			grade= sc.next();
			
			
			for(int i = 0; i<point.length; i++) {
				if(grade.equals(point[i][0])) {
					sum_grade += Double.parseDouble(point[i][1]) * credits;
					sum_credits += credits;
				}
			}
		}
		answer = sum_grade/sum_credits;
		// output
		System.out.println(answer);
		sc.close();
	}
}