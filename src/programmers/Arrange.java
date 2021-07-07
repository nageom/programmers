package programmers;

import java.util.Arrays;
import java.util.*;

public class Arrange {

	public static void main(String[] args) {
		
		
		String[] arr = {"d","b","c","a"};
		
		
		Arrays.sort(arr);
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			
			
		}
		
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.offer("b");
		pq.offer("a");
		pq.offer("c");
		pq.offer("d");
		pq.offer("f");
		
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		
		StringBuilder sb = new StringBuilder(); 
		sb.append("abc");
		sb.append("ghi");
		sb.append("def");
		//sb.reverse();°Å²Ù·Î
		
		System.out.println(sb);
		
		ArrayList<Integer> w=new ArrayList<Integer>();
		ArrayList<Integer> copy_w=new ArrayList<Integer>();
		copy_w.addAll(w);
		
		
	}
	
}
