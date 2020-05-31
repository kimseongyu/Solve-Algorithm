package Devday.summer2020;

public class Devday1 {
	public int solution(int[][] seat) {
        int count = 0;
        for(int i = 0; i < seat.length; i++){
            int a = seat[i][0];
            int b = seat[i][1];
            for(int j = 0; j < i; j++){
                if(a == seat[j][0] && b == seat[j][1]){
                    count--;
                    break;
                }
            }
            count++;
        }
        return count;
    }
}

// 2차원 배열로 좌표가 주어졌을 때 중복되지 않는 좌표의 수를 구하여라.
// 좌표의 개수는 최대 100000개 이고 좌표의 범위는 x,y 각각 100000이다.

// 91.3점 개수와 범위가 커졌을 때 시간이 오래걸려서 실패한 경우들이 있는 듯 하다.