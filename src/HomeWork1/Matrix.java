package HomeWork1;

import java.util.Arrays;

public class Matrix {
	int[][] m;

	Matrix(int[][] ar) {
		m = ar.clone();
	}

	long sum() {
		long sum = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				sum += m[i][j];
			}
		}
		return sum;
	}
void print(){
	System.out.println("Your matrix: \n");
	for (int i = 0; i < m.length; i++) {
		for (int j = 0; j < m[i].length; j++) {
			System.out.printf("%3d", m[i][j]);
		}
		System.out.println();
	}	
}
	long pro() {
		long p = 1;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				p *= m[i][j];
			}
		}
		return p;
	}
  boolean isRect(){
		int tmp = m[0].length;
		boolean check = true;
		for (int []a: m){
			if (tmp != a.length){
				check = false;
				break;
			}
		}
		return check;
	}
	boolean isSquare(){
		if(this.isRect()){
			return (m.length == m[0].length);
		}
		return false;
	}
	int [][] transpon(){
		int [][]tmp = new int [m[0].length][m.length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				tmp[j][i] = m[i][j];
			}
		}
		return tmp;
	}
	void printRow(int idx){
		if ((idx < m.length)&&(idx >= 0))
		 System.out.println(idx+" row: "+Arrays.toString(m[idx]));
		else System.out.println("Index is out of range");
	}
	boolean isSortedRow(int idx){
		for(int i = 0; i < m[idx].length - 1; i++){
			if (m[idx][i] > m[idx][i+1])
				return false;
		}
		return true;
	}
	boolean isSortedCol(int idx){
		if (this.isRect()){
			for(int i = 0; i < m.length - 1; i++){
			   if (m[i][idx] > m[i+1][idx])
					return false;
			}
			return true;
	      }
		return false;
	}	
	int[] allData(){
		int all = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				all ++;
			}
		}
		int [] res = new int [all];
		int idx = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				res[idx] = m[i][j];
				idx ++;
			}
		}
	return res;
	}
}
