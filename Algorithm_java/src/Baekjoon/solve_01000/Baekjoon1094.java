package Baekjoon.solve_01000;

import java.util.Scanner;

public class Baekjoon1094 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int a = 0;
		int b = 64;
		while(true) {
			if(x/b == 1) {
				x -= b;
				a++;
			}
			if(x == 0)
				break;
			b /= 2;
		}
			System.out.print(a);
	}
}
