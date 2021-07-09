package greedy;
import java.util.*;

public class MakeBigNum {
	 public static String solution(String number, int k) {
	    String answer = "";
	    //String[] arr = number.split("");
	    //int[] nums = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();

	    
	    /*
	    for (int i=0; i<nums.length-1; i++) {
	    	
	    	if (k==0) {
    			answer+=Integer.toString(nums[i]);
    			System.out.println("k==0");
    			//System.out.println("i: "+nums[i] + ", i+1 : "+ nums[i+1]);

	    	}else {
	    		
	    		if (nums[i]<nums[i+1]) {
	    			//System.out.println("i: "+nums[i] + ", i+1 : "+ nums[i+1]);
	    			k--;
	    			System.out.println("k--: "+ k);
	    		}else {
	    			answer+=Integer.toString(nums[i]);
	    			
	    		}
	    		
	    		
	    	}
	    	
	    }
	    */
	    StringBuilder sb = new StringBuilder();
	    
		int cnt = number.length() - k;
        int left = 0;
        int right = number.length() - cnt;
        int max = -1;
        int idx = 0;
        
        while(cnt > 0) {
        	 max = -1;
             for(int j = left ; j <= right ; ++j){
                 int num = number.charAt(j) - '0'; // ¹®ÀÚ¿­¿¡ ¹®ÀÚ¿­'0'À» »©´Ï int¸¦ ¹ñ¾î³Â´Ù. 
                 if(num > max){
                     idx = j;
                     max = num;
                 }
             }
             sb.append(number.charAt(idx));
             left = idx + 1;
             right = number.length() - --cnt;
        }

        return sb.toString();
	       
	}
	
	
	public static void main(String[] args) {
		String number = "4177252841";
		int k = 4;
		System.out.println(solution(number, k));
		
	}
}
