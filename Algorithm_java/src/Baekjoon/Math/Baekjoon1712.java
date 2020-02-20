package Baekjoon.Math;

import java.util.Scanner;

public class Baekjoon1712 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if(b>=c) {
			System.out.print(-1);
		}else {
			System.out.print(a/(c-b)+1);
		}
	}
}
