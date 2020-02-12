package Baekjoon.KakacoCode2018;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baekjoon15956 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String code = input.next();
		String[] eachCode = code.split("&&");
		Map<String, String> equal = new HashMap<String, String>();
		Map<String, String> nonEqual = new HashMap<String, String>();
		for(int i = 0; i < eachCode.length; i++) {
			if(eachCode[i].contains("==")) {
				String[] e = eachCode[i].split("==");
				equal.put(e[0], e[1]);
			}else if(eachCode[i].contains("!=")) {
				String[] ne = eachCode[i].split("!=");
				equal.put(ne[0], ne[1]);
			}
		}
	}
}
