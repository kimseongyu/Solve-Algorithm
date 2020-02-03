package Baekjoon.KakacoCode2018;

import java.util.Scanner;

public class Baekjoon15953 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		for(int i = 0; i < testCase; i++) {
			int money = 0;
			int first = input.nextInt();
			int second = input.nextInt();
			switch(first) {
			case 1:
				money += 5000000;
				break;
			case 2:case 3:
				money += 3000000;
				break;
			case 4:case 5:case 6:
				money += 2000000;
				break;
			case 7:case 8: case 9:case 10:
				money += 500000;
				break;
			case 11:case 12:case 13:case 14:case 15:
				money += 300000;
				break;
			case 16:case 17:case 18:case 19: case 20:case 21:
				money += 100000;
				break;
			default:
				money += 0;
			}
			switch(second) {
			case 1:
				money += 5120000;
				break;
			case 2:case 3:
				money += 2560000;
				break;
			case 4:case 5:case 6:case 7:
				money += 1280000;
				break;
			case 8: case 9:case 10:case 11:case 12:case 13:case 14: case 15:
				money += 640000;
				break;
			case 16:case 17:case 18:case 19:case 20:case 21:case 22:case 23:case 24:case 25:case 26:case 27:case 28:case 29:case 30:case 31:
				money += 320000;
				break;
			default:
				money += 0;
			}
			System.out.println(money);
		}
	}
}
