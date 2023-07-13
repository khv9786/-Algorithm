import java.math.BigInteger;
import java.util.*;
 
public class Main {
    public static void main(String[] args){
        //input
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();

        //logic
        
        BigInteger answer = n.divide(m);
        BigInteger etc = n.remainder(m);    
        //output
        System.out.println(answer);
        System.out.print(etc);
    }
}