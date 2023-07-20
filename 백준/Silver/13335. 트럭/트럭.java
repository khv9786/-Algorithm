import java.util.*;
 
public class Main {
    public static void main(String[] args){
        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int L = sc.nextInt();      
        
        Queue<Integer> truck = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();
        
        for(int i = 0; i<n; i++) {
        	truck.offer(sc.nextInt());
        }     
        
        sc.close();
        
        int answer = 0;
        int weight = 0;
        
        for(int i = 0; i<w; i++) {
        	bridge.offer(0); // 0으로 먼저 채워준다.
        }
        

               
        //logic
        while ( !bridge.isEmpty()){
        	answer ++;
        	weight -= bridge.poll(); // 다리에서 트럭 빼기
        	if( !truck.isEmpty()) {  // 트럭이 남아있고
        		if(truck.peek() + weight <= L) { // 최대하중보다 낮다면
        			weight += truck.peek();      // 무게 추가
        			bridge.offer(truck.poll());  // 트럭 다리로 이동	
        		}else {
        			bridge.offer(0);			 // 하중보다 높다면 0으로 자리 채우기
        		}
        	}
        }// while
        
        //output
        	System.out.print(answer);
     
    }
   
}