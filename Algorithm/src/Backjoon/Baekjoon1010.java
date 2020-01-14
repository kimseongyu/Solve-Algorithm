package Backjoon;

import java.util.Scanner;

public class Baekjoon1010 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i = input.nextInt();
		for(int a = 0; a < i; a++) {
			int j = input.nextInt();
			int k = input.nextInt();
			System.out.println(Combination(k,j));
		}
	}
	
	public static int Combination(int a, int b) {
		if(a == 0 | b == 0)
			return 1;
		if(a == b)
			return 1;
		return Combination(a-1,b-1) + Combination(a-1,b);
	}
	
//	public static int Combination(int a, int b) {
//		int comb = 1;
//		int d = b;
//		if(a - b <= 1) {
//			return comb;
//		}
//		for(int c = b; c <= a; c++) {
//			comb = comb * c;
//		}
//		for(int c = 1; c <= a-d; c++) {
//			comb = comb / c;
//		}
//		return comb;
//	}
}
