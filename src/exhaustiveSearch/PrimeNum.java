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
	                if (!visit[i]) { //true�� �ٲ㼭 �迭 2��°, 3��° ������ �ϳ��� �迭�� �־��ִ� ����
	                    visit[i] = true;
	                    result[start] = map[i]; // result[0]=[1], result[1]=[7] 
	                    cycle(start+1, end, length); //findPrime�� �����ϱ����� start++
	                    visit[i] = false;
	                }
	            }

	        }

	    }

	public static void findPrime() {

	        // ���ڷ� ��ȯ
	        String str = "";
	        for(int i=0; i<result.length; i++)
	            str += result[i];
	        int num = Integer.parseInt(str);

	        // ���� ó��
	        if(num == 1 || num == 0)
	            return;

	        // �Ҽ� ���� �˻�
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

