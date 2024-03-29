package src.programmers.level1;

import java.util.stream.IntStream;

/**
 *  월간 코드 챌린지 시즌1
 *
 *  내적 (Inner Product)
 */
public class MonthlyChallengeInnerProduct {

    private static int streamSolution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(i -> a[i] * b[i]).sum();
    }

    private static int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += (a[i] * b[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};

        /**
         * 예상) 3
         */
        int answer = solution(a, b);
        System.out.println("answer = " + answer);

    }
}


