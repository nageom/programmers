package stackqueue;

import java.util.*;
public class Stock {

	public static int[] solution(int[] prices) { //4,3,1,1,0
        
        
        Queue<Integer> que = new LinkedList<Integer> ();
        Queue<Integer> que2 = new LinkedList<Integer> ();
        
        for(int i=0; i< prices.length; i++) {
            que.offer(prices[i]);
        
        }
        int size = que.size(); 
        for (int i=0; i< size; i++)  {
        	int count = 0; 
        	
        	int first = que.poll();
        	
        	for (int tmp : que) {  		
        		//작거나 같으면 떨어지지않음
        		// 3 <= 2 
        		if (first <= tmp) {
        			count++;        			
        		}else {
        			count++;
        			break;
        		}  	
        	}

        	que2.offer(count);
   	
        }
        

        int[] answer = new int[que2.size()];
       
        for (int i=0; i<answer.length; i++) {
        	
        	answer[i]= que2.poll();
        	
        }
        
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		
		int [] prices = {1,2,3,2,3};
		
		int[] answer = solution(prices);
		for (int a : answer) {
			System.out.println(a);
			
		}
		
	}
}
