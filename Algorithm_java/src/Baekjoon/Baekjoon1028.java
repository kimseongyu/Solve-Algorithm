package Baekjoon;

import java.util.Scanner;

public class Baekjoon1028 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		String[] s = new String[y];
		for(int i = 0; i < y; i++)
			s[i] = sc.next();
		
		int max = 0;
		for(int i = 0; i < y; i++) {
			for(int j = 0; j < x; j++) {
				if(s[i].charAt(j) == '0') {
					continue;
				}
				int size = 0;
				for(int k = j; k < x; k++) {
					if(i+size >= x) {
						break;
					}
					if(s[i].charAt(k) == '0' | s[i+size].charAt(j) == '0') {
						break;
					}
					boolean b = true;
					for(int l = 0; l <= size; l++) {
						if(s[i+l].charAt(k) == '0' | s[i+size].charAt(j+l) == '0') {
							b = false;
							break;
						}
					}
					size++;
					if(b) {
						max = Math.max(max, size);
					}
				}
			}
		}
		System.out.print(max);
	}
}
