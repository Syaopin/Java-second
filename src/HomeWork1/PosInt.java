package HomeWork1;

public class PosInt {
	private int x;
	public PosInt(int x) {
		if (x < 0) {
			throw new RuntimeException("Your x is negative!");
		}
		this.x = x;		
	}
	public Boolean isEven(){
		return x%2 == 0;
	}
	
	public Boolean isOdd(){
		return !isEven();
	}
	
	public Boolean isPrime(){
		for(int i = 2; i < x/2; i ++){
			if (x % i == 0){
				return false; 
			}		
		}
		return true;
	}
	public Boolean isPerfect(){
		int sum = 0;
		for(int i = 1; i <= x/2; i ++){
			if (x % i == 0){
				sum +=i; 
			}		
		}
		return x == sum;
	}
	public boolean isSquare(){
		return (Math.sqrt(x) - (int)Math.sqrt(x)) == 0;
	}
	public boolean isDegree5(){
		return (Math.pow(x, 0.2) - (int)Math.pow(x, 0.2)) == 0;
	}
	public int [] getAllDivisors(){
		int count = 0;
		for(int i = 1; i <= x/2; i ++){
			if (x % i == 0){
				count ++; 
			}
	    } 
		int [] tmp = new int [count];
		int j = 0;
		for(int i = 1; i <= x/2; i ++){
			if (x % i == 0){
				tmp[j] = i;
				j ++;
			}
	    } 
		return tmp;
	}
	@Override
	public String toString() {
		return "Your digit x = " + x;
	}

}

