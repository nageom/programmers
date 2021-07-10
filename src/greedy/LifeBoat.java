package greedy;
import java.util.*;
public class LifeBoat {

	 public static int solution(int[] people, int limit) {
	        int answer = 0;
	        
	        Arrays.sort(people);
	        //int answer = 0;
	        int tmp = people[0];//50
	       // boolean flag = false;
	        int remind = limit - people[0];
	        for (int i=0; i< people.length; i++) {
	        	if(remind-people[i] > 0 ) {
	        		remind -= people[i];
	        		
	        	}else if(remind-people[i]==0){
	        		answer++;
	        		remind = limit;
	        		
	        	}else {
	        		answer++;
	        		remind = limit-people[i];
	        	}
	        	
	        }
	        
	        
	        
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		int[] people = {70, 80, 50};
		int limit = 100;
	
		System.out.println(solution(people, limit));
		
	}
	
	
	
}
