package Baekjoon.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon1389 {
	private static int user;
	private static int relationNum;
	private static int[] bacon;
	private static int[][] bfs;
	private static boolean[] visit;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int smallNum = 1;
		
		user = input.nextInt();
		relationNum = input.nextInt();
		bacon = new int[user];
		bfs = new int[user + 1][user + 1];
		visit = new boolean[user + 1];
		for (int i = 0; i < relationNum; i++) {
			int x = input.nextInt();
			int y = input.nextInt();
			bfs[x][y] = bfs[y][x] = 1;
		}
		for (int i = 1; i <= user; i++) {
			bacon[i-1] = baconFunc(i);
			visit = new boolean[user + 1];
		}
		for(int i = 1; i < user; i++) {
			if(bacon[i] < bacon[smallNum-1]) {
				smallNum = i+ 1;
			}
		}
		System.out.println(smallNum);
	}

	public static int baconFunc(int i) {
		Queue<Integer> q = new <Integer>LinkedList();
		int[] size = new int[2];
		size[0] = 1;
		int pluseNum = 1;
		int bacon = 0;
		
		q.offer(i);
		visit[i] = true;

		while (!q.isEmpty()) {
			int temp = q.poll();
			for (int j = 1; j <= user; j++) {
				if (bfs[temp][j] == 1 && visit[j] == false) {
					q.offer(j);
					visit[j] = true;
					bacon += pluseNum;
					size[1]++;
				}
			}
			if(--size[0] == 0) {
				size[0] = size[1];
				size[1] = 0;
				pluseNum++;
			}
		}
		return bacon;
	}
}