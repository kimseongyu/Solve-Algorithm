package Backjoon;

import java.util.Scanner;

public class Baekjoon3460 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int testCase = input.nextInt();
		for(int i = 0; i < testCase; i++) {
			int tenNum = input.nextInt();
			String twoNum = Integer.toBinaryString(tenNum);
			for(int j = twoNum.length() - 1; j >= 0; j--) {
				if(twoNum.charAt(j) == '1') {
					System.out.print(twoNum.length()-1-j +" ");
				}
			}
			System.out.println("");
		}
	}
}
