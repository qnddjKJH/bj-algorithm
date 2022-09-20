package src.baekjoon.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int origin = Integer.parseInt(br.readLine());

        int result = origin;
        int cnt = 0;

        do {
            result = ((result % 10) * 10) + (((result / 10) + (result % 10)) % 10);
            cnt++;
        } while (origin != result);
        System.out.println(cnt);
    }
}
