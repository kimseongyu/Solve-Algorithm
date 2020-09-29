package ThinkProgramming;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		s = sc.nextLine();
		int n = 0;
		while(!s.equals("고무오리 디버깅 끝")) {
			if(s.equals("문제")) {
				n++;
			}else {
				if(n > 0) {
					n--;
				}else {
					n += 2;
				}
			}
			s = sc.nextLine();
		}
		if(n == 0) {
			System.out.print("고무오리야 사랑해");
		}else {
			System.out.print("힝구");
		}
	}
}
