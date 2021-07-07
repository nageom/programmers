package stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class Truck {

	 public static int solution(int bridge_length, int weight, int[] truck_weights) {
	        int answer = 0;
	        
	        // bridge_length 보다 많은 수면 안되고
	        // 무게 합이 weight을 넘어서도 안되고
	        // 
	        
	        //객체에 ㄷ ㅏ넣고 
	        
	        // que 에  몽땅 넣나? 
	        
	        // 트럭 한번 지나갈때 , 1초 소요됨. 
	        
	        // 객체에 
	       
	        Queue<Integer> que = new LinkedList<Integer>();
	        
	        for (int i =0; i< truck_weights.length; i++) {
	        	
	        	que.offer(truck_weights[i]);
	        	
	        }
	        
	        while (que.isEmpty()) {//int [] truck_weights = {7,4,5,6};
	        	
	        	//일단 빼두고
	        	//int first = que.poll();
	        	// 7 // 4
	        	boolean flag = false;
	        	
	        	int result=0;
	        	int count =0;
	        	for (int tmp : que) { 
	        		
	        		//int first = que.poll();
	        		count ++;//1 //2 //3
	        				//4 // 5 //6
	        		result+= tmp;//4 
	        				//9 //15
	        		if (result > weight) {
	        			//count =0이라 못함
	        			for (int i=0; i< count -1; i++) {
	        				que.poll();		
	        			}
	        			answer += count-1;
	        			result = 0;
	        			answer++;
	        			count=0;
	        			break;
	        			
	        		}else if (result == weight) {	
	        			for (int i=0; i< count; i++) {
	        				que.poll();     				
	        			}
	        			answer += count;
	        			
	        		}
	        		
	        		//que.poll();
	        		//count ++; 
	        	}
	        	
	        	/*
	        	
	        	while (count!=0) {
	        		que.poll();
	        		count --;
	        		
	        	}
	        	*/
	        	
	        	//카운트 수만큼  x2 
	        	// 1 
	        	//answer ++;    	
	        }
	        
	        
	        
	        
	        		
	        
	        return answer*2;
	    }
	
	
	
	public static void main(String[] args) {
		
		int bridge_length = 2;
		int weight = 10;
		int [] truck_weights = {7,4,5,6};
		System.out.println("answer : "+ solution(bridge_length,weight, truck_weights));
		
	}
}
