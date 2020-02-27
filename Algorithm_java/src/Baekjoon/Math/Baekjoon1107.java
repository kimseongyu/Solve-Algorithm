package Baekjoon.Math;

import java.util.Scanner;

public class Baekjoon1107 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		boolean[] n = new boolean[10];			//고장o ->true 고장x -> false
		for(int i = 0; i < b; i++)
			n[s.nextInt()] = true;
		int m = Math.abs(a - 100);				//+-만으로 이동할 수 있는 횟수
		for(int i = 0; i < 999999; i++) {
			String c = Integer.toString(i);
			boolean d = false;
			for(int j = 0; j < c.length();j++)	//숫자에 고장난 숫자가 포함되어 있으면 continue
				if(n[c.charAt(j)-48])
					d = true;
			if(d)continue;
			int p = Math.abs(a - i);			//숫자에서 +-만으로 이동할 수 있는 횟수
			m = Math.min(m, c.length()+p);		//숫자의 길이 + +-이동횟수와 비교하여 짤으면 최숫값 저장
		}
		System.out.print(m);
	}
}
