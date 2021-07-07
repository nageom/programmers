import java.util.*;

public class Test2 {

	
	public static void main(String[] args) {
		int n= 5;
		int[] lost= {2,3,4};
		int[] reserve = {1,2,3};
		boolean[] flag = new boolean [n];
		//Arrays.sort(reserve);
		//Arrays.sort(lost);
		for(int a : lost) {
				System.out.println("a: "+ a);
	        	System.out.println("Arrays.asList(reserve).contains(a): "+Arrays.asList(reserve).contains(a));
	        	if (Arrays.asList(reserve).contains(a)) {
	        		flag[a] = true;
	        		
	        	}
	        	
	    }
		 
		 int tmp =  new Integer(1);
		 
		 //System.out.println("¿Õ : "+  Arrays.asList(reserve).contains(tmp));
		 System.out.println("¿Õ : "+  Arrays.stream(reserve).anyMatch(i->i==2));
		 //System.out.println("¿Õ : "+  Arrays.binarySearch(a, key));
		 
		 
		 String [] arr = {"a", "b", "c"};
		 String [] arr2 = {"a", "bb", "c"};
		 
		 System.out.println("String : "+Arrays.asList(arr).contains("a") );
		 
		 
		 
	}
	
	
	
}
