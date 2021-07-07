package exhaustiveSearch;
import java.util.*;
public class MockTest {
		//17
	public static int[] solution(int[] answers) {
		
		int[] p1 = {1,2,3,4,5};
		int[] p2 = {2,1,2,3,2,4,2,5};
		int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        
        Queue<Integer> que = new LinkedList<Integer>();

        
        int res1=0;
        int res2=0;
        int res3=0;
        
        for(int i=0; i<answers.length; i++) {
            if(p1[i%p1.length]==answers[i]) {res1++;}
            if(p2[i%p2.length]==answers[i]) {res2++;}
            if(p3[i%p3.length]==answers[i]) {res3++;}     
        }
        int max = Math.max(Math.max(res1, res2), res3);
        if(max == res1) {que.add(1);}
        if(max == res2) {que.add(2);}
        if(max == res3) {que.add(3);}
        
        
        int[] answer = new int[que.size()];
        
        
        for(int i=0; i< answer.length; i++) {

            answer[i] = que.poll();
        }


            
        return answer;
		
	}
	

	public static void main(String[] args) {
		
		int answers[] = {1,3,2,4,2};
		
		int answer[] = solution(answers);
		for(int a : answer) {
			System.out.println(a+" ");
		}
		
	}
}
