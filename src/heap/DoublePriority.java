package heap;

import java.util.Collections;

import java.util.PriorityQueue;

public class DoublePriority {

	 public static int[] solution(String[] operations) {
	        int[] answer = {0,0};
	        PriorityQueue<Integer> ascPq = new PriorityQueue<Integer>();
	        PriorityQueue<Integer> desPq = new PriorityQueue<Integer>(Collections.reverseOrder());
	        
	        
	        for (int i=0; i< operations.length; i++) {
	        	String[] order = operations[i].split(" ");
	        	int order1 = Integer.parseInt(order[1]);
	        	
	        	switch (order[0]) {
	        		case "I" : 
	        			ascPq.offer(order1);//16
	        			desPq.offer(order1);//16
	        			break;
	        		case "D": 
	        			if (ascPq.size()==0) {break;}
	        			
	        			if (order1 == 1) {//최댓값 삭제
	        				ascPq.remove(desPq.poll());
	        				break;
	        		
	        			}else {// -1  최솟값 삭제시 
	        				desPq.remove(ascPq.poll());
	        				break;
	        			}
	
	        	}
	        	
	        	
	        	if (i == operations.length-1) {  		
	        		if (!ascPq.isEmpty() ) {
	        			answer[0]= desPq.poll();
	        			answer[1]= ascPq.poll();
	        		}
	        	}

	        }
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		
		String[] operations2 = {"I 16", "D 1"};
		String[] operations = {"I 7", "I 5", "I -5", "D -1"};
		int[] answer = solution(operations);
		for (int a : answer ) {
			System.out.println(a + " ");
		}
		
	}
}
