package stackqueue;

import java.util.Queue;
import java.util.*;

public class FunctionDevelopment {

	 public static int[] solution(int[] progresses, int[] speeds) {

	      Queue<Integer> que = new LinkedList<>(); 
	      Queue<Integer> que2 = new LinkedList<>(); 
	      
	      int i = 0;
	      int day = 1; 
	      int k = 0; //k는 배포 횟수 
	      for(i = 0; i<progresses.length; i++) {
	         que.offer(progresses[i]);
	      }
	   
	      int count=0;
	      i=0;
	      boolean check = false; // 100이 안됐다. 
	       
	      while(i<progresses.length) {
	                                                //            1일 ,  2일     7일
	         int total = que.peek()+(speeds[i]*day); // total = 93+1*1, 93+1*2  93+1*7 // 30 + 30*7 //55 + 5*7
	         System.out.println("total: "+ total + " day : "+ day );
	          
	         if(total>=100) {   //total 93  //94 //95 //100 //240  //
	        	 k++;   //k=1; k=2; // 배포 값 
	        	 i++;   //i=1 i=2;  // 다음 숫자로 넘김 
	        	 que.poll(); //[30,55] //[55]
	        	 check = true; 
	        	 System.out.println("k : "+ k+ ", i : "+ i + " ,que.poll(): " + que.peek()+" check: "+ check );
	        	 
	        	 if ( i == speeds.length ) {
	        		 que2.offer(k);	 
	        		 count++;
	        	 }
	            
	         }else {    // total=90
	             
	            if(k!=0 && check == true ) { //배포한 후 온 친구들 
	               que2.offer(k); // [2][0][0] 
	               k=0;
	               count++;
	            }
	            System.out.println("total : " + total + "  100이 안됐다 ");
	            check = false;
	            day++;        // j =1 j =2; 7 
	         }
	     
	      }
	  
	      int[] answer = new int[count];
	      System.out.println("count :"+ count);
	      System.out.println("que2.size(): "+ que2.size());
	       
	      int t=0;
	      while(!que2.isEmpty()) {
	    	  answer[t]= que2.poll();
	    	  t++;
	       }
	       
	     
	      return answer;

	   }
	
	public static void main(String[] args) {
		int[] prog = {93,30,55};
		int[] speed = {1,30,5};
		int[] answer = solution(prog, speed);
		
		for (int a : answer) {
			System.out.println(a);
		}
		
	}
	
	
	
	
}
