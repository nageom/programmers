package sort;
import java.util.*;
public class HIndex {

	public static int solution (int[] citations) {
		int answer = 0;
		//k�� 0 �̻�, length����
		int k = citations.length;
		
		Arrays.sort(citations);
		//0 1 3 5 6
		//87 56
		int index =0;
		int tmp = 0;
		for (int i=0; i<citations.length; i++) {
			if (citations[i]>= k )  {
				//k�̻��̸� �� ���� �����͵� ��� k �̻�
				tmp = citations.length-i;

				if(tmp == k) {
					break;
				}
			}
			k--;
			
		}
		
		answer = tmp;
		return answer;
		
		
	}
	
	public static void main(String[] args) {
		int[] citations = {2,2,2,2,2};
		
		System.out.println(solution (citations));
		
	}
}
