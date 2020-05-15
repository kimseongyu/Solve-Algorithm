package Baekjoon.solve_01000;

import java.util.Scanner;

public class Baekjoon1003 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		for(int a = 0; a < i; a++) {
			int n = input.nextInt();
			int b = fibonacci(n-1);
			int c = fibonacci(n);
			System.out.println(b + " " + c);
		}
	}
	
	public static int fibonacci(int n) {
		if(n == 0)
			return 0;
		if(n <= 1)
			return 1;
		
		int a = 0;
		int b = 1;
		int c = 1;
		
		for(int i = 0; i < n-2; i++) {
			a = b;
			b = c;
			c = a + b;
		}
		return c;
	}

//	private static int odd = 0;
//	private static int even = 0;
//	
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		
//		int i = 0;
//		i = input.nextInt();
//		int n;
//		for(int a = 0; a < i; a++) {
//			odd = 0;
//			even = 0;
//			n = input.nextInt();
//			fibonacci(n);
//			System.out.print(odd + " " + even);
//		}
//	}
//	
//	public static int fibonacci(int n) {
//	    if (n == 0) {
//	    	odd++;
//	    	return 0;
//	    } else if (n == 1) {
//	        even++;
//	    	return 1;
//	    } else {
//	        return fibonacci(n-1) + fibonacci(n-2);
//	    }
//	}
}