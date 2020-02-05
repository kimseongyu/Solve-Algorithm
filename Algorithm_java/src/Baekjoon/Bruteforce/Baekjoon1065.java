package Baekjoon.Bruteforce;

import java.util.Scanner;

public class Baekjoon1065 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int count = 0;
		if(num < 100) {
			count = num;
		}else if(100 <= num & num <= 1000) {
			count = 99;
			for(int i = 100; i <= num; i++)
				if(i/100 - i%100/10 == i%100/10 - i%10)
					count++;
		}
		System.out.print(count);
	}
}
