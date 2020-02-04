package Baekjoon;

import java.util.Scanner;

public class Baekjoon6603 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			int allNum = input.nextInt();
			int[] num = new int[allNum];
			if(allNum == 0) break;
			for(int i = 0; i < allNum; i++)
				num[i] = input.nextInt();
			
		}
	}
	
	public static int comb(int[] array) {
		// for i 를 제외한 수를 arr에 넣고 array의 크기가 6이 될때까지 재귀로 줄임 6이 되면 출력
	}
}
