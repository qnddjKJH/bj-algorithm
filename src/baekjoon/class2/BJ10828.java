package src.baekjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int N = Integer.parseInt(bufferedReader.readLine());

        MyStack myStack = new MyStack();

        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            String cmd = stringTokenizer.nextToken();
            if (cmd.equals("push")) {
                int data = Integer.parseInt(stringTokenizer.nextToken());
                myStack.push(data);
            } else if (cmd.equals("pop")) {
                System.out.println(myStack.pop());
            } else if (cmd.equals("size")) {
                System.out.println(myStack.size());
            } else if (cmd.equals("empty")) {
                System.out.println(myStack.empty());
            } else if (cmd.equals("top")) {
                System.out.println(myStack.top());
            }
        }

    }

    static class MyStack {
        private final int MAX_SIZE = 10000;
        int topIdx;
        Integer[] stack;

        public MyStack() {
            this.topIdx = -1;
            this.stack = new Integer[MAX_SIZE];
        }

        public void push(int data) {
            stack[++topIdx] = data;
            if (topIdx >= MAX_SIZE) {
                topIdx = MAX_SIZE - 1;
            }
        }

        public int pop() {
            if(topIdx < 0) {
                return -1;
            }
            Integer data = stack[topIdx--];

            return data == null ? -1 : data;
        }

        public int size() {
            return topIdx + 1;
        }

        public int empty() {
            return topIdx < 0 ? 1 : 0;
        }

        public int top() {
            if(empty() == 0) {
                return (stack[topIdx] == null) ? -1 : stack[topIdx];
            }
            return -1;
        }
    }
}


