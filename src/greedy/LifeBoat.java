package greedy;
import java.util.*;
public class LifeBoat {

	 public static int solution(int[] people, int limit) {
	        int answer = 0;
	        
	        Arrays.sort(people);//50 50 70 80
	       
	        int start = 0;
	        for (int end = people.length-1 ; end>=start; end--) {
	        	if(people[start]+ people[end] > limit) {
	        		answer++;
	        	}
	        	else {
	        		start++;
	        		answer++;
	        	}
	        	
	        }
	       
	        
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		int[] people = {70, 80, 50};
		int[] people2 = {70, 50, 80, 50};
		int[] people3 = {40,40,80};

		int limit = 100;
	
		System.out.println(solution(people3, limit));
		
	}
	
	
	
}
