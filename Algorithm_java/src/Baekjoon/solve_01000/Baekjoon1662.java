package Baekjoon.solve_01000;

import java.util.Scanner;

public class Baekjoon1662 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nexts = sc.next();
		String firsts = "";
		String num = "";
		for(int i = 0; i < nexts.length(); i++) {
			if(nexts.charAt(i) == ')') {
				String k = "";
				int q, j;
				for(j = firsts.length()-1; firsts.charAt(j) != '('; j--) {
					k += firsts.charAt(j);
				}
				j--;
				k = (new StringBuffer(k)).reverse().toString();
				q = nexts.charAt(j)-48;
				firsts = firsts.substring(0, j);
				while(q-->0) {
					firsts += k;
				}
			}else {
				firsts += nexts.charAt(i);
			}
		}
		System.out.print(firsts.length());
	}
}
