package Baekjoon.Math;

import java.util.Scanner;

public class Baekjoon2010 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = 0;
		for(int i = 0; i < a; i++)
			b += input.nextInt();
		System.out.print(b-a+1);
	}
}
