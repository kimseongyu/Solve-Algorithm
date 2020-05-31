package Devday.summer2020;

import java.util.Scanner;

public class Devday3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rule = sc.next();
		String A = Numto(rule, sc.next());
		String B = Numto(rule, sc.next());
		System.out.print(solution(rule,A,B));
	}
	
	public static String solution(String rule, String A, String B) {
        String answer = "";
        long a = toTenNum(rule,A);
        long b = toTenNum(rule,B);
        long c = a - b;
        answer = Long.toString(c, rule.length());
        return Numto(rule, answer);
    }

    public static long toTenNum(String rule, String A) {
        long num = 0;
        for(int i = 0; i < A.length(); i++){
            for(int j = 0; j < rule.length(); j++){
                if(rule.charAt(j) == A.charAt(i)){
                    num += j * ((long)Math.pow(rule.length(),A.length()-i-1));
                }
            }
        }
        return num;
    }

    public static String Numto(String rule, String A) {
        String s = "";
        long num = Long.parseLong(A);
        for(int i = 0; i < A.length(); i++){
            // 여기
        }
        return s;
    }
}

// N진수 A B가 주어지고 진수들의 숫자들은 rule 문자열의 index별로 치환되어있다.
// A - B의 결과를 치환된 N진수로 출력하시오.

// 40점 11이상의 진수를 처리할 때 10진수에서 N진수를 변환하는데 실수를 하였다.