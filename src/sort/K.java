package sort;
import java.util.*;
public class K {


	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = null;
        List<Integer> answerTmp = new ArrayList<Integer>();

        List<Integer> arr = null;
        int i=0;
        for (; i< commands.length; i ++) {
        	arr = new ArrayList<Integer>();
        	
            int start =commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];
       
            for (int t=start-1; t<end; t++) {
                arr.add(array[t]);
              
            }
            
            
            Collections.sort(arr);
            //Á¤·Ä
       
            answerTmp.add(arr.get(k-1));   
        }
 
        i =0;
        answer = new int[answerTmp.size()];
        for (int a : answerTmp) {
        	answer[i++] = a;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands= {{2,5,3}, {4,4,1}, {1, 7, 3}};
		int[] answer = solution(array, commands);
		for (int a : answer ) {
			System.out.println(a+ " ");
			
		}
		
	}
	
}
