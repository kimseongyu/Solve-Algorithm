package Backjoon;

import java.util.Scanner;

public class Baekjoon2839 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num =input.nextInt();
		int count = 0;
		while(num > 2) {
			if(num % 5 == 0) {
				count += num / 5;
				num = 0;
			}else {
				num -= 3;
				count++;
			}
		}
		if(num == 0) {
			System.out.println(count);
		}else {
			System.out.println(-1);
		}
	}
}
