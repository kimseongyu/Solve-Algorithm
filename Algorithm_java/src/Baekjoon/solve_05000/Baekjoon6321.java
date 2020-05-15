package Baekjoon.solve_05000;

import java.util.Scanner;

public class Baekjoon6321 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int a = input.nextInt();
		int d ;
		String[] b = new String[a];
		String[] c = new String[a];
		for(int i = 0; i < a; i++) {
			b[i] = input.next();
			c[i] = "";
		}
		for(int j = 0; j < a; j++) {
			for(int k = 0; k < b[j].length();k++) {
				if( b[j].charAt(k) == 90) {
					d = b[j].charAt(k)-25;
				}else {
					d = b[j].charAt(k)+1;
				}
				c[j] += (char)d;
			}
		}
		for(int i = 0; i< a; i++) {
			System.out.println("String #"+(i+1));
			System.out.println(c[i] +"\n");
		}
	}
}
