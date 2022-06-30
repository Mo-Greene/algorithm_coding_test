package ct5;

import java.util.Scanner;

public class ct5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        int N = in.nextInt();

        //에라토스테네스의 체 사용하기 소수
        boolean arr[] = new boolean[N + 1];
        arr[0] = true;
        arr[1] = true;
        for (int i = 2; i <= Math.sqrt(arr.length); i++){
            if (arr[i]) continue;
            for (int j = i * i; j < arr.length; j+= i){
                arr[j] = true;
            }
        }

        // M 부터 N까지를 도는 for 문 작성
        for (int i = M; i <= N; i++) {
            if(!arr[i])
                System.out.println(i);
        }
    }
}

//문제
//M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다.
//(1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
//
//출력
//한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.