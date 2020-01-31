package Baekjoon;

import java.util.Scanner;

public class Baekjoon4659 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			String password = input.next();
			if(password.equals("end"))
				break;
			boolean pass = false;
			for(int i = 0; i < password.length();i++) {
				if(password.charAt(i) == 'a' | password.charAt(i) == 'e' | password.charAt(i) == 'i' | password.charAt(i) == 'o' | password.charAt(i) == 'u')
					pass = true;
			}
			for(int i = 1; i < password.length(); i++) {
				if(password.charAt(i) == password.charAt(i-1)) {
					if(password.charAt(i) != 'e' & password.charAt(i) != 'o')
						pass = false;
				}
			}
			for(int i = 2; i < password.length(); i++) {
				int num1 = 0, num2 = 0, num3 = 0;
				if(password.charAt(i-2) == 'a' | password.charAt(i-2) == 'e' | password.charAt(i-2) == 'i' | password.charAt(i-2) == 'o' | password.charAt(i-2) == 'u')
					num1 = 1;
				if(password.charAt(i-1) == 'a' | password.charAt(i-1) == 'e' | password.charAt(i-1) == 'i' | password.charAt(i-1) == 'o' | password.charAt(i-1) == 'u')
					num2 = 1;
				if(password.charAt(i) == 'a' | password.charAt(i) == 'e' | password.charAt(i) == 'i' | password.charAt(i) == 'o' | password.charAt(i) == 'u')
					num3 = 1;
				if(num1 == num2 & num1 == num3) {
					pass = false;
				}
			}
			if(pass) {
				System.out.println("<"+password+"> is acceptable.");
			}else {
				System.out.println("<"+password+"> is not acceptable.");
			}
		}
	}
}
