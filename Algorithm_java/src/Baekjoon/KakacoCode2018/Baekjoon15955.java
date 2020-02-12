package Baekjoon.KakacoCode2018;

import java.util.Scanner;

public class Baekjoon15955 {
	public static int[][] check;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int checkPoint = input.nextInt();
		int question = input.nextInt();
		check = new int[checkPoint][2];
		for(int i = 0; i < checkPoint; i++) {
			check[i][0] = input.nextInt();
			check[i][1] = input.nextInt();
		}
		for(int i = 0; i < question; i++) {
			int start = input.nextInt()-1;
			int end = input.nextInt()-1;
			int hp = input.nextInt();
			int booster = 0;
			boolean yes = booster(start,end,hp,booster);
			if(yes) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
	
	public static int distance(int start, int end) {
		int x = (int)Math.pow(check[start][0]-check[end][0], 2);
		int y = (int)Math.pow(check[start][1]-check[start][1], 2);
		return x+y;
	}
	
	public static boolean booster(int start, int end, int hp, int booster) {
		for(int i = 0; i < check.length; i++)
			if(check[start] == check[i])
				booster++;
		
		if(hp >= distance(start,end)) // 돌아온 목적지가 0이면 yes 무족건 반환
			return true;
		boolean[] bool = new boolean[check.length];
		for(int i = 0; i < check.length; i++) {
			if(check[start][0] == check[i][0] ^ check[start][1] == check[i][1]) {
				bool = booster(i, end, hp, --booster);//제자리 돌아오는거 체크
			}
		}
		boolean yes = false;
		for(int i = 0; i < check.length; i++)
			yes |= bool[i];
		if(yes) {
			return true;
		}
		for() {
			
		}
	}
}