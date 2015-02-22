package HomeWork9;

import java.util.ArrayList;

public class Task1 {

	enum UkrCoin {
		ONE(1), TWO(2), FIVE(5), TEN(10), TWFIVE(25), FIFTY(50), HRYVNA(100);
		private int val;

		UkrCoin(int v) {
			val = v;
		}

		public int getVal() {
			return val;
		}
	}

	public static ArrayList<String> func(int x) {
		int tmp = x;
		ArrayList<String> res = new ArrayList<String>();
		UkrCoin[] ua = UkrCoin.values();
		for (int i = 1; i <= ua.length; i++) { // go through all nominals one by
												// one, starting from the
												// biggest
			while (tmp >= ua[ua.length - i].getVal()) { // if our initial money
														// amount bigger then
														// current nominal
				res.add(ua[ua.length - i].toString()); // add this nominal to
														// resulting array
				tmp = tmp - ua[ua.length - i].getVal(); // decrease initial
														// money amount by this
														// nominal
			}
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println("---------------- Task 1 ------------------");
		int kop = 128;
		System.out.println("You have " + kop + " copecks, so you need: "
				+ func(kop));
		kop = 500;
		System.out.println("You have " + kop + " copecks, so you need: "
				+ func(kop));
	}

}