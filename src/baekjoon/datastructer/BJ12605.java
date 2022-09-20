package src.baekjoon.datastructer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ12605 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int index = 1;

        while (n-- > 0) {
            String[] arr = br.readLine().split(" ");

            sb.append("Case #" + (index++) + ":");
            for (int i = arr.length - 1; i >= 0; i--) {
                sb.append(" " + arr[i]);
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
