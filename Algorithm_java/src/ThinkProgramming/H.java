package ThinkProgramming;

import java.util.Scanner;

public class H {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int hp = sc.nextInt();
		int[] c = new int[n];
		int[] d = new int[n];
		int[] check = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
			check[i] = 0;
		}

		int tmp;
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (c[j] < c[j + 1]) {
					tmp = d[j];
					d[j] = d[j + 1];
					d[j + 1] = tmp;
					tmp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = tmp;
				} else if (c[j] == c[j + 1]) {
					if (d[j] < d[j + 1]) {
						tmp = d[j];
						d[j] = d[j + 1];
						d[j + 1] = tmp;
						tmp = c[j];
						c[j] = c[j + 1];
						c[j + 1] = tmp;
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(c[i] + " " + d[i]);
		}

		int time = 0;
		while (hp > 0) {
			for (int i = 0; i < n; i++) {
				if (check[i] == 0) {
					hp -= d[i];
					check[i] = c[i];
					break;
				}
			}

			for (int i = 0; i < n; i++) {
				if (check[i] != 0) {
					check[i]--;
				}
			}
			time++;
		}
		System.out.print(time);
	}
}
