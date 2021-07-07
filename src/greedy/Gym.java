package greedy;

import java.util.*;


public class Gym {
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = -1;
        
        boolean[] flag = new boolean[n+1]; 
        Arrays.fill(flag,true);    // [true, true, true, true, true]
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for (int i=0; i<lost.length; i++) {
        	flag[lost[i]]= false;   
        }
        System.out.println("lost�� false----------");
        for (boolean a : flag) {
        	System.out.println(" "+ a);
        }
        
        System.out.println("���ϸ¾����� ������ �����ִ� �л� true, 0���� ��ȯ-----------");
        for(int a : lost) {
        	if (Arrays.stream(reserve).anyMatch(i->i==a)) {       		
        		flag[a] = true;	 
        		for (int t =0; t<reserve.length; t++) {
        			if (reserve[t]==a) {
        				reserve[t]=0;	
        			}
        			
        		}
        		
        	}
        }
        
        

        for (boolean a : flag) {
        	System.out.println(" "+ a);
        }
       
       // System.out.println("start");
        
        for (int i=0; i<reserve.length; i++) {
        	int prev = reserve[i]-1;
        	int post= reserve[i]+1;
        	
        	//���ϸ¾����� ������ �����ִ� �л�
        	if (reserve[i] == 0) {
        		continue;
        	}
        	//reserve[0]�� 1�ϰ�� �ڿ� ���� ��
        	if (i==0 && reserve[0]==1) {
        		if (flag[post]==false) {
        			flag[post]=true;
        		}     		
        		
        		continue;
        	}
        	
        	//reserve�� �������迭�� flag�� �������϶� 
        	// �ڽ��� �ո� ��
        	if(i == reserve.length-1) {
        		if (reserve[i] == flag.length-1) {
        			if(flag[prev] == false) {
            			flag[prev]=true;
        			}
        			break;    		
        		}
        		
        	}
        	
        	
        	if(flag[prev]==false) {
        		flag[prev]=true;   		
        	}else if (flag[post]==false) {	
        		flag[post]=true;
        		
        	}
        }
        System.out.println("��� ==============");
        for (boolean a : flag) {
        	System.out.println(" "+ a);
        }
        
        
        
        //int count=-1;
        for (int i =0; i<flag.length; i++) {
        	if(flag[i]==true) {
        		answer++;
        	}
        }
        return answer;
    }
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int n= 5;
		int[] lost= {3,5};
		int[] reserve = {2,4};
		//5���;��� 
		int result = solution(n, lost, reserve);
		
		System.out.println("Result : "+ result );
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
