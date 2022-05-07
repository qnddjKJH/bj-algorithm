package programmers.level1;

/**
 * 약수의 개수 덧셈과 뺄셈
 */
public class MeasureAddSub {
    public static int anotherSolution(int left, int right) {
        // 약수의 특징을 이용함...수학 어려워요...몰라...기억안나...
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }
    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int left = 13;
        int right = 17;

        int answer = solution(left, right);
        System.out.println("answer = " + answer);
    }


}
