package questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 첫 줄 입력 n (1<=n<=100000)
 * 두번째 줄부터 한개씩 n 번
 */

public class StackSequence {

    public void answer() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        int start = 0;
        while(N-- > 0) {
            int in = Integer.parseInt(br.readLine());
            System.out.println("in:" + in +", start: " + start);
            
            if(in > start) {
                for(int i = start+1; i <= in; i++) {                    
                    stack.push(i);
                    sb.append("+").append("\n");
                    System.out.println(i);
                }
                start = in;
            } else if(stack.peek() != in) {
                System.out.println("NO");
                System.exit(0);
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);


        // 해설 - 뭔가 마음에 안듬
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        // int N = Integer.parseInt(br.readLine());

        // int[] stack = new int[N];

        // int idx = 0;
        // int start = 0;

        // while(N-- > 0) {
        //     int value = Integer.parseInt(br.readLine());
            
        //     if(value > start) {
        //         for(int i = start + 1; i <= value; i++) {
        //             stack[idx] = i;
        //             idx++;
        //             sb.append('+').append("\n");
        //         }
        //         start = value;
        //     } else if(stack[idx - 1] != value) {
        //         System.out.println("NO");
        //         System.exit(0);
        //     }

        //     idx--;
        //     sb.append('-').append("\n");
        // }
        // System.out.println(sb);



        // 예제 1만 푼 내 코드..
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());
        // Stack<Integer> stack = new Stack<>();
        
        // int[] arr = new int[n];
        // for(int i=0; i < n; i++) {
        //     arr[i] = Integer.parseInt(br.readLine());
        // }
        
        // int i = 1;
        // int j = 0;

        // stack.push(i++);
        // System.out.println("+");


        // while(!stack.empty()) {
        //     if(stack.peek() == arr[j]) {
        //         stack.pop();
        //         System.out.println("-");
        //         j++;
        //     } else {
        //         stack.push(i++);
        //         System.out.println("+");
        //     }
        // }
    }
}
