package ct4;

import java.util.Scanner;

public class ct4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // YXX, YYXX 방식의 호텔 방 번호가 있음
        int T = sc.nextInt();   // 테스트 데이터
        for(int i = 0; i < T; i++){
            int H = sc.nextInt();   // 호텔 층의 갯수
            int W = sc.nextInt();   // 호텔 각층의 방의 갯수
            int N = sc.nextInt();   // N 번째로 온 손님

            int Y;  // N 번째 손님이 가야할 층수
            if(N % H == 0){
                // Y는 호텔 호수의 앞번호를을 담당하기 때문에 100을 곱해야됨 ex: 3XX 호
                Y = H * 100;
            } else {
                Y = (N % H) * 100;
            }

            int X;
            if(N % H == 0){
                X = N / H;
            } else {
                X = (N / H) + 1;
            }
            System.out.println(Y + X);
        }
    }
}
