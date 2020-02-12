package Baekjoon.Bruteforce;

import java.util.Scanner;

public class Baekjoon2231 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = 0;
		for(int i = 1; i <= a; i++) {
			b = i;
			String c = Integer.toString(i);
			for(int j = 0; j < c.length();j++) {
				b += c.charAt(j)-48;
			}
			if(a == b) {
				System.out.print(i);
				break;
			}
		}
		if(a != b)
			System.out.print(0);
	}
}