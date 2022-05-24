package programmers.level2;

import java.util.Arrays;

public class H_Index {

    public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        int idx = (citations.length / 2) - 1;
        int half = citations[idx];

        for (int i = 0; i < citations.length; i++) {
            answer = citations.length - i;
            System.out.println("answer = " + answer);
            if (citations[i] >= answer) {
                System.out.println("citations[i] = " + citations[i]);
                return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        int answer = solution(citations);

        System.out.println("answer = " + answer);
    }

}
