package src.baekjoon.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2525 {
    public static void main(String[] args) throws IOException {
        // 입력값 m2 는 최소 0분 ~ 최대 1000분(16시간 40분) 이다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(br.readLine());


        m2 += (h * 60) + m;

        h = (m2 / 60) % 24;
        m = m2 % 60;

        System.out.println(h + " " + m);
    }
}
