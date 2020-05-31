package Devday.summer2020;

public class Devday2 {
	public String[] solution(String[][] booked, String[][] unbooked) {
        String[] answer = new String[booked.length + unbooked.length];
        booked = timeToNum(booked);
        unbooked = timeToNum(unbooked);
        int a = 0;
        int b = 0;
        int unb = 0;
        int i = 1;
        while((b != booked.length) || (unb != unbooked.length)){
            if(b != booked.length){
                if(Integer.parseInt(booked[b][0]) <= i){
                answer[a] = booked[b][1];
                a++;
                b++;
                i += 10;
                continue;
            }
            }
            if(unb != unbooked.length){
                if(Integer.parseInt(unbooked[unb][0]) <= i){
                answer[a] = unbooked[unb][1];
                a++;
                unb++;
                i += 10;
                continue;
            }
            }
            i++;
        }
        return answer;
    }

    public String[][] timeToNum(String[][] arr){
        for(int i = 0; i < arr.length; i++){
            int h = (arr[i][0].charAt(0)-48)*10 + (arr[i][0].charAt(1)-48);
            int m = (arr[i][0].charAt(3)-48)*10 + (arr[i][0].charAt(4)-48);
            int clock = h * 60 + m;
            arr[i][0] = Integer.toString(clock);
        }
        return arr;
    }
}

// 예약된 손님들과 예약하지 않은 손님들이 방문한 시간("00:00")과 이름("kim")이 2차원 배열로 주어진다.
// 예약된 손님들과 예약하지 않은 손님들이 방문한 시간이 겹칠 때 예약된 손님부터 받는다.
// 손님들을 처리하는 시간은 10분이 소모되고 시간은 00:01 - 23:50까지 주어진다.
// 처리하는 손님들을 순서대로 출력하라.

// 100점