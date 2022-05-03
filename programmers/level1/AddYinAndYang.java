package programmers.level1;

import java.util.stream.IntStream;

/**
 * 월간 코드 챌린지 시즌 2
 *
 * 음양 더하기
 */
public class AddYinAndYang {

    public static int streamSolution(int[] absolutes, boolean[] signs) {
        return IntStream.range(0, absolutes.length).map(i -> signs[i] ? absolutes[i] : absolutes[i] * -1).sum();
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            answer += signs[i] ? absolutes[i] : absolutes[i] * -1;
            // 리팩토링
//            if (signs[i]) {
//                answer += absolutes[i];
//            } else {
//                answer -= absolutes[i];
//            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};

        /**
         * 예상) 9
         */
        int answer = solution(absolutes, signs);
        System.out.println("answer = " + answer);
    }
}
