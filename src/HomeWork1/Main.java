package HomeWork1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		 try {
			 PosInt num = new PosInt(8);
			 System.out.println(num.toString());
			 System.out.println("Check whether digit is perfect: "+num.isPerfect());
			 System.out.println("Check whether digit is even: "+num.isEven());
			 System.out.println("Check whether digit is odd: "+num.isOdd());
			 System.out.println("Check whether digit is prime: "+num.isPrime());
			 System.out.println("Check whether digit is square: "+num.isSquare());
			 System.out.println("Check whether digit is degree 5: "+num.isDegree5());
			 System.out.println("Get all divisors: "+Arrays.toString(num.getAllDivisors()));
		 }
		 catch (Exception e){
			 System.out.println("error with message: "+e.getMessage());
		 }

	}

}
