package hash;

import java.util.HashMap;

public class camouflage {

	public static void main(String[] args) {
		
		String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"},{"green_turban", "headgear"}};
		int answer = 0;
        HashMap<String, Integer> map= new HashMap<String, Integer>();
       
        for (int i=0; i< clothes.length; i++) {
            map.put(clothes[i][1], 0 );       
        }
    
        for(String key: map.keySet()) {
            for (int i=0; i<clothes.length; i++) {
                if ( key.equals(clothes[i][1]) ) {
                    int tmp = map.get(key);
                    tmp +=1;
                    map.put(key, tmp);
                }
            
            }
        
        }
        int result =1;
        for (int value : map.values() ) {
            result *= value+1;
        
        }
        result -=1;
             
        answer = result;
        
        System.out.println("answer :"+ answer);
    	}
		
		
}
	
	

