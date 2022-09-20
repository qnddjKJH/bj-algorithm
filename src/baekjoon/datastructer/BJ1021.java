package src.baekjoon.datastructer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BJ1021 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        LinkedList<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        System.out.println("q = " + q);

        int cnt = 0;
        st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            int target = Integer.parseInt(st.nextToken());
            int size = q.size() / 2;

            if(q.size() % 2 == 0) {
                size -= 1;
            }
            while (!(q.peek() == target)) {
                if (q.indexOf(target) <= size) {
                        q.add(q.poll());
                        cnt++;
                } else {
                        q.addFirst(q.pollLast());
                        cnt++;
                }
            }
            q.poll();
            System.out.println("q = " + q + ", cnt = " + cnt);
        }
        System.out.println("cnt = " + cnt);
    }
}
