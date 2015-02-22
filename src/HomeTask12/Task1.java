package HomeTask12;

import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		Queue<Integer> q = new Queue<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity of members:");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i<=n; i ++){
        	q.enqueue(i);
        }
        System.out.println("Enter m:");
        int m = Integer.parseInt(sc.nextLine());
        int i = 0;
        while(q.size()>1){
        	System.out.println(q);
        		   if (i != m){
        			   q.enqueue(q.dequeue());
        			   i ++;
        		   }
        		   else{
        			   q.dequeue();
        			   i = 0;
        			   continue;
        		   }      		  
        		
        	   }
        System.out.println(q);
        	   
        }
	}
