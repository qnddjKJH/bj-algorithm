package datastructer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class LineUp {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            int m = Integer.parseInt(st.nextToken());
            if(m == 0) {
                list.add(i);
            } else if(m > 0) {
                int index = list.size() - m;
                list.add(index, i);
            }
        }

        list.forEach(v -> {
            System.out.print(v + " ");
        });
    }
}
