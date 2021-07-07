package programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

public class HashTest {
	

	public static void main(String[] args) {
		
		String[] a = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] b = {"josipa", "filipa", "marina", "nikola"};
		String answer="";
		//System.out.println(a.length);
		
		/* 없애는 특성때문에 set을 사용하지 못한다. 
		HashSet<String> set = new HashSet<String>();
		for (String name: a) {
			set.add(name);
		}
		for (int i=0; i<b.length; i++) {
			if (set.contains(b[i])) {
				set.remove(b[i]);
			}
		}
	     */
		//List<E>
		
		
		
		for (int i=0; i<b.length; i++) {
            for (int j=0; j<a.length; j++) {
                if (a[j].equals(b[i])) {
                    a[j] = "null";
                    break;
                }
            }
        }
     
		//중복값을
        
        for (int i=0; i<a.length; i++) {
            if (!a[i].equals("null")) {
                answer = a[i];
            }
  
        }
  
        System.out.println("answer : "+ answer);
   
    // Vector<E>
    
    
		
		
	
		 
		
		
	}

			
}
