package Baekjoon.unsolve;

public class Baekjoon6679 {
	public static void main(String[] args) {
		
		String tenCase;
		String twelveCase = "";
		String sixteenCase = "";
		for(int i = 1000; i <= 9999; i++) {
			tenCase = Integer.toString(i);
			twelveCase = change(i,12);
			sixteenCase = change(i, 16);
			System.out.println(tenCase +""+ twelveCase + "" + sixteenCase);
//			if(sum(tenCase) == sum(twelveCase) & sum(tenCase) == sum(sixteenCase)) {
//				System.out.println(i);
//			}
		}
	}
	
	public static String change(int value, int i){
		String returnString = "";
        String temp = "";


        while(value != 0){

            // 나머지가 0~9 사이이면  캐릭터 값을 배열에 저장
            if( (value % i) < 10 ) {
                //문자열 우->좌로 배열
                returnString = (value % i) + returnString;
                //몫을 구함
                value /= i;
            }
            // 나머지가 10 이상이면 해당하는 값의 알파벳을 저장
            else {
                int temp1 = (char)((value % i)  + 55);

                returnString = Integer.toString(temp1) + returnString;
            }

        }

        return returnString;
    }
	
	public static int sum(String a) {
		int num = 0;
		for(int i = 0; i < a.length(); i++) {
			int eachNum = Integer.parseInt(a, i);
			if(0 <= eachNum &  eachNum <= 9) {
				num += eachNum;
			}else {
				num += eachNum-55;
			}
		}
		return num;
	}
}
