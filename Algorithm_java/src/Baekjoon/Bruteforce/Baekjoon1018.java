package Baekjoon.Bruteforce;

import java.util.Scanner;

public class Baekjoon1018 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		String[] BW = new String[a];
		for(int i = 0; i < a; i++)
			BW[i] = input.next();
		int c = 65;
		for(int i = 0; i <= a-8; i++) {
			for(int j = 0; j <= b-8; j++) {
				String[] d = new String[8];
				for(int k = 0; k < 8; k++)
					d[k] = BW[i+k].substring(j, j+8);
				int e = Math.min(func(d,'B'), func(d, 'W'));
				c = Math.min(c, e);
			}
		}
		System.out.print(c);
	}
	
	public static int func(String[] a, char b) {
		int c = 0;
		for(int i = 0; i < 8; i++)
			for(int j = 0; j < 8; j++)
				if(i % 2 == 0 & j % 2 == 0 & b != a[i].charAt(j))
					c++;
				else if(i % 2 == 1 & j % 2 == 1 & b != a[i].charAt(j))
					c++;
				else if(i % 2 == 1 & j % 2 == 0 & b == a[i].charAt(j))
					c++;
				else if(i % 2 == 0 & j % 2 == 1 & b == a[i].charAt(j))
					c++;
		return c;
	}
}