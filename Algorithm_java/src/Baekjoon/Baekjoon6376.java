package Baekjoon;

public class Baekjoon6376 {
	public static void main(String[] args) {
		double a = 1;
		double e = 2.5;
		System.out.println("n e");
		System.out.println("- -----------");
		System.out.println("0 1");
		System.out.println("1 2");
		System.out.println("2 2.5");
		for(int i = 3; i < 10; i++) {
			for(int j = 1; j <= i; j++) {
				a *= j;
			}
			e += 1/a;
			a = 1;
			System.out.println(i+ " " +String.format("%.9f", e));
		}
	}
}
