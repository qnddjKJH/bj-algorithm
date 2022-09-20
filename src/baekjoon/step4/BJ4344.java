package src.baekjoon.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < C; i++) {
            double sum = 0;
            String line = bufferedReader.readLine();
            String[] s = line.split(" ");
            int N = Integer.parseInt(s[0]);

            for(int j = 1; j <= N; j++) {
                sum += Integer.parseInt(s[j]);
            }
            sum = sum / N;
            int count = 0;
            for(int j = 1; j < s.length; j++) {
                if (Double.parseDouble(s[j]) > sum) {
                    count++;
                }
            }
            System.out.println(count);
            double result =  ((double) count / N) * 100;
            System.out.printf("%.3f%%\n", result);
        }
    }
}
