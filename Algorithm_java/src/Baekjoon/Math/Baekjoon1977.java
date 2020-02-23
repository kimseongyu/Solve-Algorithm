package Baekjoon.Math;

import java.util.Scanner;

public class Baekjoon1977 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int min = input.nextInt();
		int max = input.nextInt();
		boolean[] yes = new boolean[100];
		boolean ok = false;
		for(int i = 1; i <= 100; i++) {
			if(min <= i*i & i*i <= max) {
				yes[i-1] = true;
				ok = true;
			}
		}
		int sum = 0;
		int minnum = 0;
		if(ok) {
			for(int i = 100; i > 0; i--) {
				if(yes[i-1]) {
					sum += i*i;
					minnum = i*i;
				}
			}
			System.out.print(sum +"\n" +minnum);
		}else {
			System.out.print(-1);
		}
	}
}
