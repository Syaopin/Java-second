package HomeWork1;

import java.util.Random;
import java.util.Stack;

public class Java2_HT7 {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		Random rand = new Random();
		for (int i = 0; i <= stackLength; i++) {
			st.push(rand.nextInt(20));
		}
		System.out.println("======================Task 3=====================");
		System.out.println("Stack before reverse: ");
		System.out.println(st);
		System.out.println("Stack after reverse: ");
		reverse(st);
		System.out.println("======================Task 4=====================");
		String str = "(((5+0)*(1+2))-7)";
		
		System.out.println(st);
		System.out.println("======================Task 5=====================");
		System.out.println("Maximum element in "+st+ " is: "+maxFromStack(st));

	}
	static double calcExp(String exp){
		Stack<Character>st = new Stack<Character>();
		Stack<String>st1 = new Stack<String>();
		for (char c: exp.toCharArray()){
			if (c == '(') st.push(c);
			if (c != '('){
				if (st.isEmpty()) return Double.NaN;
				
			}
		}
		return 0;
	}
	static void reverse(Stack<Integer> inp) {    //method to reverse original stack
		Stack<Integer> tmp = new Stack<Integer>();
		Stack<Integer> tmp1 = new Stack<Integer>();
		while (!inp.empty()) {
			tmp.push(inp.peek());
			inp.pop();
		}
		while (!tmp.empty()) {
			tmp1.push(tmp.peek());
			tmp.pop();
		}
		while (!tmp1.empty()) {
			inp.push(tmp1.peek());
			tmp1.pop();
		}
	}
	static  int maxElement = Integer.MIN_VALUE;    //static variable to store maximum element of stack
	static  int stackLength = 5;   //length of stack
	static int tmp = stackLength;  //temporary variable for recursion
	
	static void stackSearchRecursion(Stack<Integer> s){ //method to search for maximum element in stack
		while(tmp >=0){
			int i = s.peek();
			if (i > maxElement) maxElement = i;
			s.pop();
			tmp --;
			stackSearchRecursion(s);
			s.push(i);
		}
	}
	static int maxFromStack(Stack<Integer> in){  //method to return maximum value
		stackSearchRecursion(in);
		return maxElement;
	}
}