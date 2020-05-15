package Baekjoon.solve_10000;

import java.util.Scanner;

public class Baekjoon11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 2;
		while(n != 1) {
			if(n % num == 0) {
				n = n / num;
				System.out.println(num);
			}else {
				num++;
			}
		}
	}
}
