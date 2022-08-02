package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (a1, a2) -> {
            if (a1.length() == a2.length()) {
                return a1.compareTo(a2);
            } else {
                return a1.length() - a2.length();
            }
        });

        StringBuilder sb = new StringBuilder();
        // 역시 stream 은 편하고 좋으나 느리다 단순 계산은 그냥 for 문이 최고
//        Arrays.stream(arr).forEach(s -> {
//            if(!sb.toString().contains(s)) {
//                sb.append(s).append("\n");
//            }
//        });

        sb.append(arr[0]).append("\n");
        for (int i = 1; i < N; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                sb.append(arr[i]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
