package HomeWork1;

import java.util.Arrays;

public class Java2_HT5_2 {

	public static void main(String[] args) {
int [][]x = {	{1, 2, 3},
			{2, 4, 2},
			{2, 4, 1}
			};
       Matrix a = new Matrix(x);
       a.print();
       System.out.println("Sum of all elements: "+ a.sum());
       System.out.println("Multiplication of all elements: "+ a.pro());
       System.out.println("Whether matrix is rectangular: "+a.isRect());
       System.out.println("Whether matrix is square: "+a.isSquare());
       System.out.println("Transposed matrix: "+Arrays.deepToString(a.transpon()));
       System.out.println("Print row: "); a.printRow(2);
       System.out.println("Is sorted row: "+a.isSortedRow(1));
       System.out.println("Is sorted column: "+a.isSortedCol(2));
       System.out.println("All elements: "+Arrays.toString(a.allData()));
	}

}
