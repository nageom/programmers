package stackqueue;

import java.util.Queue;
import java.util.*;

public class Printer {

	public static int Solution(int[] priorities, int location) {   	
		//queue�� ����ϴµ�, que�ȿ� �⺻�ڷ����� �ƴ� ��ü�� �����ؼ� ��������ν� location��ġ�� ���� �����̵����Ѵ�. 
		int answer = 0;
	        class Prior {
	            int index;
	            int value; 
	            
	            Prior (int i, int v) {
	                index = i;
	                value = v;
	                
	            }
	        }
	        
	        Queue<Prior> que = new LinkedList<Prior> ();
      
	        for (int i=0; i< priorities.length; i++) {
	        	que.offer(new Prior(i, priorities[i]));	
	        }
	        
	       // int count =0; 
	        while (!que.isEmpty()) {
	            boolean check = false;
	            
	            int first = que.peek().value;
	            
	            for (Prior tmp : que) {                
	                if (first < tmp.value ) {
	                    check = true;
	                    break;
	                }       
	            }
	            
	            if(check) {
	            	que.offer(que.poll());
	                              
	            }else {
	                if (que.poll().index == location ) {
	                	//6 - 4 
	                    answer = priorities.length - que.size();              
	                }
	                
	            }

	        }//while ��
			return answer;
	   
	    }
	    
	
	public static void main(String[] args) {
		int[] priorities = {1,1,9,1,1,1};
		int location = 0;
	
		System.out.println(Solution(priorities, location));
	}
	
	
}
