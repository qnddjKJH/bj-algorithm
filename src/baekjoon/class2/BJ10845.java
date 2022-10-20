package src.baekjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BJ10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int N = Integer.parseInt(bufferedReader.readLine());

        MyQueue myQueue = new MyQueue();

        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            String cmd = stringTokenizer.nextToken();
            if (cmd.equals("push")) {
                int data = Integer.parseInt(stringTokenizer.nextToken());
                myQueue.push(data);
            } else if (cmd.equals("pop")) {
                System.out.println(myQueue.pop());
            } else if (cmd.equals("size")) {
                System.out.println(myQueue.size());
            } else if (cmd.equals("empty")) {
                System.out.println(myQueue.empty());
            } else if (cmd.equals("front")) {
                System.out.println(myQueue.front());
            } else if (cmd.equals("back")) {
                System.out.println(myQueue.back());
            }
        }

    }

    static class MyQueue {
        private final int MAX_SIZE = 10000;
        private int firstIdx;
        private List<Integer> queue;

        public MyQueue() {
            this.firstIdx = -1;
            this.queue = new ArrayList<>();
        }

        public void push(int data) {
            queue.add(0, data);
            firstIdx++;
        }

        public int pop() {
            if(firstIdx < 0) {
                return -1;
            }
            Integer data = queue.get(firstIdx);
            if(data == null) {
                data = -1;
            } else {
                queue.remove(firstIdx--);
            }

            return data;
        }

        public int size() {
            return queue.size();
        }

        public int empty() {
            return queue.isEmpty() ? 1 : 0;
        }

        public int front() {
            if(empty() == 0) {
                Integer data = queue.get(firstIdx);
                return data == null ? -1 : data;
            }
            return -1;
            
        }

        public int back() {
            if(empty() == 0) {
                Integer data = queue.get(0);
                return data == null ? -1 : data;
            }
            return -1;
        }
    }
}