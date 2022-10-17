package src.baekjoon.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        int count = 0;
        boolean flag;
        for (int i = 0; i < N; i++) {
            flag = true;
            String s = bufferedReader.readLine();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (j < s.length() - 1) {
                    if (!(c == s.charAt(j + 1))) {
                        if (s.substring(j + 2).contains(c + "")) {
                            flag = false;
                            break;
                        }
                    }
                }
            }
            count = flag ? count + 1 : count;
        }
        System.out.println(count);
    }
}
