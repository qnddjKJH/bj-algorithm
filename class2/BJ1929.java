package class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 소수 판별하기
public class BJ1929 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        if(n < 2) {
            return;
        }

        // 에라스토테네스의 체
        // 1. 배열을 생성하여 초기화한다. (판별할 모든 수까지 배열 지정)
        boolean[] arr = new boolean[n+1];
        arr[0] = arr[1] = true;
        // 2. 2부터 시작해서 특정 수의 배수에 해당하는 수를 모두 지운다.
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (arr[i]) {
                continue;
            }

            for (int j = i * i; j < arr.length; j = j + i) {
                arr[j] = true;
            }
        }

        for (int i = m; i < n; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }




        // 절반까지만 확인
//        boolean flag;
//        for (int i = m; i < n; i++) {
//            flag = true;
//            for(int j = 2; j <= i/2; j++) {
//                if (i % j == 0) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                System.out.println(i);
//            }
//        }

//        알고리즘 없이 푼거 - 1,000,000 입력인데 나중가면 감당 안됨
//        O(n^2) 임
//        boolean flag;
//        for (int i = m; i < n; i++) {
//            flag = true;
//            for(int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                System.out.println(i);
//            }
//        }
    }
}
