package Baekjoon.Beginners;

import java.util.Scanner;

public class Baekjoon5766 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			int week = input.nextInt();
			int ranker = input.nextInt();
			int[] people = new int[10000];
			if(week == 0)break;
			for(int i = 0; i < week * ranker; i++)
				people[input.nextInt()-1]++;
			int max = people[0];
			for(int i = 1; i < 10000; i++)
				if(max < people[i])
					max = people[i];
			int maxsecond = 0;
			for(int i = 0; i < 10000; i++)
				if(maxsecond < people[i] & people[i] < max)
					maxsecond = people[i];
			for(int i = 0; i < 10000; i++)
				if(maxsecond == people[i])
					System.out.print(i+1 + " ");
			System.out.println();
		}
	}
}
