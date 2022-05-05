package programmers.level1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NotExistNumAdd {
    // 밑에 두 솔루션 합쳐진 초간단 솔루션
    private static int hammerStreamSolution(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }

    // 내가 생각은 했지만 stream 을 몰라서 구현 못한거
    private static int streamSolution(int[] numbers) {
        // 이거는 0~9 범위에서 매칭 안되는거 합 구하는거
        return IntStream.range(0, 9).filter(i -> Arrays.stream(numbers).noneMatch((num -> i == num))).sum();
    }

    // 와 망치에 직격타 당했땈ㅋㅋㅋㅋㅋㅋ
    private static int hammerSolution(int[] numbers) {
        int sum = 45;
        for (int number : numbers) {
            sum -= number;
        }
        return sum;
    }

    private static int solution(int[] numbers) {
        int answer = 0;
        int[] all = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int number : numbers) {
            all[number] += 1;
        }

        for (int i = 0; i < all.length; i++) {
            if(all[i] == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};

        // 5 + 9 = 14
        int answer = solution(numbers);
        System.out.println("answer = " + answer);
        System.out.println("hammerSolution(numbers) = " + hammerSolution(numbers));
    }
}
