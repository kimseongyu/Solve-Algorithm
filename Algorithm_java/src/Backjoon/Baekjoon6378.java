package Backjoon;

import java.util.Scanner;

public class Baekjoon6378 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String a = input.next();
		while(!a.equals("0")) {
			System.out.println(sum(a));
			a = input.next();
		}
	}
	
	public static String sum(String s) {
		int num = 0;
		for(int i = 0; i < s.length(); i++) {
			num += s.charAt(i) - 48;
		}
		s = Integer.toString(num);
		if(s.length() == 1) {
			return s;
		}else {
			return sum(s);
		}
	}
}
