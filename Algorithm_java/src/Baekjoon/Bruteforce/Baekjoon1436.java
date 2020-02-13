package Baekjoon.Bruteforce;

import java.util.Scanner;

public class Baekjoon1436 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		for(int i = 666; i < 10000000; i++) {
			String s = Integer.toString(i);
			if(s.contains("666"))
				a--;
			if(a == 0) {
				System.out.print(i);
				break;
			}
		}
	}
}