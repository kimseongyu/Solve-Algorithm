package Baekjoon.solve_01000;

import java.util.Scanner;

public class Baekjoon1978 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int count = 0;
		for(int i = 0; i < a; i++) {
			int b = input.nextInt();
			boolean c = true;
			for(int j = 2; j < b; j++) {
				if(b%j == 0) {
					c = false;
				}
			}
			if(c & b != 1) {
				count++;
			}
		}
		System.out.print(count);
	}
}
