package datastructer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stick {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        int input = 0;
        for (int i = 0; i < n; i++) {
            input = Integer.parseInt(br.readLine());
            stack.push(input);
        }

        int cnt = 1;
        int start = stack.pop();
        while(!stack.isEmpty()) {
            int temp = stack.pop();

            if (start < temp) {
                start = temp;
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
