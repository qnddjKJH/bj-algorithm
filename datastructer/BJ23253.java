package datastructer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ23253 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 교과서의 수
        int m = Integer.parseInt(st.nextToken()); // 더미의 수
        
        // 내림차순이 아닌 더미 체크 여부
        // true 순서 보장
        // false 순서 보장 안함
        boolean flag = true;

        for (int i = 0; i < m; i++) {
            int k = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" ");
            for (int j = s.length - 1; j > 0; j--) {
                if (!(Integer.parseInt(s[j]) < Integer.parseInt(s[j - 1]))) {
                    flag = false;
                    break;
                }
            }
            if (!flag) break;
        }
        System.out.println(flag ? "Yes" : "No");
    }
}
