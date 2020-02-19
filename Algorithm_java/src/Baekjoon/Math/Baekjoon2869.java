package Baekjoon.Math;

import java.util.Scanner;

public class Baekjoon2869 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		int V = input.nextInt();
		if((V-A)%(A-B) == 0) {
			System.out.print((V-A)/(A-B) + 1);
		}else {
			System.out.print((V-A)/(A-B) + 2);
		}
	}

//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		
//		int A = input.nextInt();
//		int B = input.nextInt();
//		int V = input.nextInt();
//		int D = 0;
//		while(true) {
//			D++;
//			V -= A;
//			if(V <= 0)
//				break;
//			V += B;
//		}
//		System.out.print(D);
//	}
}
