package datastructer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// x축에 평행한 조건 y 좌표가 같아야한다. + x 좌표가 안 같을때 선이 샘깅
// y 축에 평행한 조건 x 좌표가 같아야 한다. + y 좌표가 안 같을때 선이 생김
public class BJ2358 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();
        
        // 다음에 풀기
    }
}
