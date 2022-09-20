package src.baekjoon.datastructer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 결과값은 나오는데 채점하면 틀렸다고 뜸
// 아마도 성능 이슈 같은데...어디가 느린지 모르겠음
public class Souvenir {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++) {
            arr.add(i);
        }

        int round = 0;
        int point = 0;
        while (arr.size() != 1) {
            round++;
            point = (int) ((Math.pow(round, 3) - 1) % arr.size());
            arr.remove(point);
            System.out.println("round = " + round);
            System.out.println("point = " + point);
        }
        System.out.println(arr.get(0));
    }
}
