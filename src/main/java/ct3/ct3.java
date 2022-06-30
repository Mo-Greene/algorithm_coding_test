package ct3;


import java.io.*;
import java.util.StringTokenizer;

// (1 ≤ B < A ≤ V ≤ 1,000,000,000)!
public class ct3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());   // 낮에 오른 높이
        int b = Integer.parseInt(st.nextToken());   // 밤에 떨어지는 높이
        int v = Integer.parseInt(st.nextToken());   // 총 올라야할 높이

        int days = (v-a) / (a-b); // 달팽이가 정상에 오르기 전날까지의 날
        if((v - a) % (a-b) != 0) // 달팽이가 하루에 오르는 높이보다 정상까지의 높이가 짧을때
            days++;
        System.out.println(days+1); // 마지막날 오른 기록은 계산식에 포함되어있지 않으므로 출력에 1일을 더해준다.
    }
}

//문제
//땅 위에 달팽이가 있다. 이 달팽이는 높이가 V 미터인 나무 막대를 올라갈 것이다.
//
//달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
//
//달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
