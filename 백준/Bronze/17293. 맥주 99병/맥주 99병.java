import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = N; i >= 0; i--) {
            if (i >= 2) {
                sb.append(i);
                sb.append(" bottles of beer on the wall, ");
                sb.append(i);
                sb.append(" bottles of beer.\n");
                sb.append("Take one down and pass it around, ");
                sb.append(i - 1);
                if(i-1 == 1){
                  sb.append(" bottle of beer on the wall.\n");
                }else{
                  sb.append(" bottles of beer on the wall.\n");
                }
                sb.append("\n");
                
            } else if (i == 1) {
                sb.append(i);
                sb.append(" bottle of beer on the wall, ");
                sb.append(i);
                sb.append(" bottle of beer.\n");
                sb.append("Take one down and pass it around, no more bottles of beer on the wall.\n");
                sb.append("\n");
            } else if (i == 0) {
                sb.append("No more bottles of beer on the wall, no more bottles of beer.\n");
                sb.append("Go to the store and buy some more, ");
                sb.append(N);
                if(N == 1){
                  sb.append(" bottle of beer on the wall.\n");
                }else{
                  sb.append(" bottles of beer on the wall.\n");
                }
            }
        }

        System.out.println(sb);
    }
}
