import java.util.*;
public class PerTest {

	 // �Ҽ��� ����.
    static int answer = 0;
    // numbers�� �� ��° �ε����� �湮�ߴ��� ���θ� üũ�ϴ� �迭.
    static boolean[] check = new boolean[7];
    // numbers�� �� �ڸ����� ���� �� �ִ� ������ ���� �� ArrayList.
    static ArrayList<Integer> arr = new ArrayList<>();
    
    // 3. 1~n�ڸ��� ������ �����ϱ� ���� ��� �޼ҵ�
    public static void rec(String n,String temp,int len){
    	
        // 11. ���������� ���� ����� �ִ� �ڸ��� == temp�� ���� ������ ���� �ΰ��. 
        if(temp.length() == len) {
            // 12. ArrayList�� �̹� �����ϴ� �������� Ȯ���� �ߺ��� ������ ����.
            if(!arr.contains(Integer.parseInt(temp))) arr.add(Integer.parseInt(temp));              
            return;
        }
        
        
        // 4. n���� ���� �� numbers�� Ž��.
        for(int j =0;j<n.length();j++){
            // 5. �̹� �湮�� �ε����� �н�.
            if(check[j]) continue;
            // 6. �ӽ� ���� temp�� �ٿ������� ���ڸ� ����.
            temp += n.charAt(j);
            // 7. temp�� �ٿ��� ������ �湮ó��.
            check[j] = true;
            // 8. ���, �ռ� ���� temp������ ���� �� �ڸ��� ���� ��������� ���� ������ len ������ ����.
            rec(n,temp,len);
            // 9. ������ �Ϸ�Ǹ� ������ �湮ó���� �ε����� false�� ����.
            check[j] = false;
            // 10. temp �������� ������ �ڸ��� ���ڸ� �����ϰ� ����.
            temp = temp.substring(0,temp.length()-1);

        }                      
    }
    
    // 15. �Ҽ��Ǻ� �޼ҵ�
    public static void cal(int n){
        // 16. 0�� 1�� �Ҽ��� �ƴϹǷ� �ٷ� ����.
        if(n == 0) return;
        if(n == 1) return;
        
        // 17. 2~n�� �����ٱ��� ���鼭 ������ �������� �Ҽ��� �ƴϹǷ� �޼ҵ� ����.
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0) return;
        }
        
        // 18. ��� ������ �������� ������ �Ҽ��̹Ƿ� answer ����.
        answer++;
    }
    
    
    public static int solution(String numbers) { 
        // 1. numers�� �� �ڸ����� �ٿ����� ����.
        String temp="";
        
        // 2. �� �ڸ��� ���� ���� ���� ���� �ݺ�, 011�� ��� 1~3�ڸ��� �پ��� ���� ������ ����.
        for(int i = 1;i<=numbers.
        		length();i++){
            rec(numbers,temp,i);
        }
        
        // 13. ���� ��� ������ ���� ��� ArrayList Ž��.
        for(int x : arr){            
            // 14. �� �������� �Ҽ����� �Ǻ�.
            cal(x);
        }
        
        return answer;
    }
    public static void main(String[] args) {
		String numbers= "17";
		int result = solution(numbers);
	}
    
    
    
    
}
