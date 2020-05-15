package Baekjoon.solve_01000;

import java.util.Scanner;

public class Baekjoon1085 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		System.out.print(Math.min(Math.min(x, y), Math.min(input.nextInt()-x, input.nextInt()-y)));
	}
}
