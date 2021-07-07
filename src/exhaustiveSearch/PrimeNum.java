package exhaustiveSearch;
import java.util.*;
public class PrimeNum {
	private static int cnt = 0;
    private static String[] map;
    private static String[] result;
    private static boolean[] visit;
    private static HashSet<Integer> list;

	public static int solution(String numbers) {
		int answer = 0;

        visit = new boolean[numbers.length()];
        map = new String[numbers.length()];
        map = numbers.split("");

        list = new HashSet();

        for (int i=1; i<=numbers.length(); i++) {
            result = new String[i];
            cycle(0, i, numbers.length());
        }

        return list.size();
	    
	    
	}
	
	
	 public static void cycle(int start, int end, int length) {

	        if (start == end) {
	            findPrime();
	        } else {

	            for (int i=0; i<length; i++) {
	                if (!visit[i]) { //true로 바꿔서 배열 2번째, 3번째 값들을 하나씩 배열에 넣어주는 역할
	                    visit[i] = true;
	                    result[start] = map[i]; // result[0]=[1], result[1]=[7] 
	                    cycle(start+1, end, length); //findPrime에 도달하기위해 start++
	                    visit[i] = false;
	                }
	            }

	        }

	    }

	public static void findPrime() {

	        // 숫자로 변환
	        String str = "";
	        for(int i=0; i<result.length; i++)
	            str += result[i];
	        int num = Integer.parseInt(str);

	        // 예외 처리
	        if(num == 1 || num == 0)
	            return;

	        // 소수 인지 검사
	        boolean flag = false;
	        for(int i=2; i<=Math.sqrt(num); i++){
	            if(num % i == 0)
	            	
	                flag = true;
	        }

	        if(!flag)
	            list.add(num);
	    }
	
	public static void main(String[] args) {
		String numbers = "17";
		String numbers2 = "011";
		
		int result = solution(numbers);
		
		System.out.println("result : "+ result);
	}
}

