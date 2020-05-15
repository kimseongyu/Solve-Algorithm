package Baekjoon.unsolve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon15997 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		double[] score = new double[4];
		for(int i = 0; i < 4; i++)
			list.add(input.next());
		for(int i = 0; i < 6; i++) {
			String a = input.next();
			String b = input.next();
			double w = input.nextDouble();
			double d = input.nextDouble();
			double l = input.nextDouble();
			score[list.indexOf(a)] += w*3 + d*1;
			score[list.indexOf(b)] += l*3 + d*1;
		}
		double allScore = 0;
		for(int i = 0; i < 4; i++) {
			allScore += score[i];
		}
		for(int i = 0; i < 4; i++) {
			if(score[i] == 9) {
				System.out.println(1.0000000000);
			}else if(score[i] == 0) {
				System.out.println(0.0000000000);
			}else {
				System.out.println(score[i]+" "+score[i]/allScore);
			}
		}
		System.out.print(allScore);
	}
}
