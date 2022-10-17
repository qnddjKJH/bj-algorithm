package src.baekjoon.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        System.out.println(arithmetic_seq(n));
    }

    public static int arithmetic_seq(int num) {
        int cnt = 0;

        if (num < 100) {
            return num;
        }

        cnt = 99;

        for(int i = 100; i <= num; i++) {
            int hun = i / 100;
            int ten = (i / 10) % 10;
            int one = i % 10;


            if ((hun - ten) ==  (ten - one)) {
                cnt++;
            }
        }

        return cnt;
    }
}
