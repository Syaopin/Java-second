package HomeWork1;

import java.util.Arrays;


public class Java2_HT2 {

	public static void main(String[] args) {
		System.out.println("=============Task 1==============");
		String str = "to be or not to be";
		String [] tmp = str.split("o");
		System.out.println("Quantity of o in \""+str+"\" is: "+(tmp.length-1));

		System.out.println("=============Task 2==============");
		int a = 3, b = 8;
		System.out.printf("Before: a = %d, b = %d", a, b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.printf("\nAfter: a = %d, b = %d", a, b);
		
		System.out.println("=============Task 3==============");
		String s = "to  be  or  not  to    be";
		StringBuffer res = new StringBuffer();
		char [] c = s.toCharArray();
		for (int i = 0; i < c.length; i ++){
			res.append(c[i]);
			if (c[i] == ' '){
				while(c[i] == ' '){
					i ++;
				}
				i --;
			}
		}
		System.out.println("Before: "+s);
		System.out.println("After: "+res.toString());
		
		System.out.println("=============Task 4==============");
		int num = 8;
		System.out.println("Number "+num+" is power of 2: "+isPowerOf2(8));
		
		System.out.println("=============Task 5==============");
		int num1 = 50;
		System.out.println("Divisors of  "+num1+" : "+Arrays.toString(divisors(num1)));
		
	}
static boolean isPowerOf2(int x){
	if (x <= 1) return false; 
 if ( x%2 == 0){
	while(x%2 == 0){
		x /= 2;
	}
  } 
	return (x == 1);
}

static int [] divisors(int x){
	int count = 0;
	for (int i = 1; i <= x/2; i++){
		if (x % i == 0) count ++;
	}
	int [] res = new int [count+1];
	int j = 0;
	for (int i = 1; i <= x/2; i++){
		if (x % i == 0){ 
			res[j] = i;
			j ++;
		}
	}
	res[count] = x;
	return res;
}

}
