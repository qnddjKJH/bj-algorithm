package class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ2108 {
    /**
     * N 은 홀수 입력되는 정수의 개수
     * 정수의 범위 최대 4000을 넘지 않음 == -4000 ~ 4000
     * 산술평균 : N개의 수들의 합을 N 으로 나눈 값
     * 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
     * 최빈값 : N개의 수들 중 가장 많이 나타나는 값
     * 범위 : N개의 수들 중 최댓값과 최솟값의 차이
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 입력 범위 ~4000 ~ 4000
        // 4001 == 1
        // 4000 == 0
        // 3999 == -1
        int[] arr = new int[8001];

        double sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int middle = 10000;
        int mode = 10000;

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());
            sum += value;
            arr[value + 4000]++;

            if (max < value) {
                max = value;
            }

            if (min > value) {
                min = value;
            }
        }

        int count = 0;
        int modeMax = 0;

        boolean flag = false;

        for (int i = min + 4000; i <= max + 4000; i++) {

            // 카운팅이 0보다 클 때 == 입력이 된 값들
            // 카운트는 5 개 입력 0 1 2 == 3번만 카운트
            // 3998, 4001, 4002, 4003...
            // 중앙값은 4002 번지 이고 입력값 + 4000 을 하였으므로
            // -4000 으로 입력값을 가져온다
            // +4000 값들은 카운팅 정렬로 카운팅 수들이 보관된 배열의 인덱스가 된다.
            if (arr[i] > 0) {
                if (count < (N + 1) / 2) {
                    count += arr[i];
                    middle = i - 4000;
                }
            }
            if (modeMax < arr[i]) {
                modeMax = arr[i];
                mode = i - 4000;
                flag = true;
            } else if (modeMax == arr[i] && flag == true) {
                mode = i - 4000;
                flag = false;
            }
        }


        System.out.println(avg(sum, N));
        System.out.println(middle);
        System.out.println(mode);
        System.out.println(max - min);
    }

    public static int avg(double sum, int N) {
        return (int)Math.round(sum / N);
    }
}
