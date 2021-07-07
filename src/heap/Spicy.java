package heap;
import java.util.*;

public class Spicy {
	 public static int solution(int[] scoville, int K) {
		 	PriorityQueue<Integer> que = new PriorityQueue<>();
		    int answer = 0;

			for (int i = 0; i < scoville.length; i++) {
				que.offer(scoville[i]);
			}
			
			//int count=0;			
			while(!que.isEmpty()) {				
				if(que.peek() > K) {
					break;
				}
				
				if(que.size() == 1) {
					if(que.peek()<K) {
						answer=-1;		
						break;
					}	
				}
				
				//이미 첫번째 수가 K보다 작은 경우이니까
				int tmp = que.poll()+ que.poll()*2;
				que.offer(tmp);
				answer++;
				
				
			}
			return answer;

	    }
	 

	 
	 
	 public static void main(String[] args) {
		int[]scoville = {1,2,3,9,10,12};
		int k = 7;
		int answer = solution(scoville,k);


		System.out.println(answer );
	}
	
}
