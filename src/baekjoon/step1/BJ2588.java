package src.baekjoon.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String m = br.readLine();

        StringBuilder sb = new StringBuilder();

        sb.append(n * Integer.parseInt(m.substring(m.length() - 1)) + "\n");
        sb.append(n * Integer.parseInt(m.substring(m.length() - 2, m.length() - 1)) + "\n");
        sb.append(n * Integer.parseInt(m.substring(m.length() - 3, m.length() - 2)) + "\n");
        sb.append(n * Integer.parseInt(m) + "\n");

        System.out.println(sb);
    }
}
