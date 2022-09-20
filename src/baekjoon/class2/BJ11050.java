package src.baekjoon.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이항계수...
// 주어진 크기 조합에서 원하는 개수만큼 순서없이 뽀는 조합의 가짓수
public class BJ11050 {

    // 이항계수공식
    // 전체 집합에서 원소의 개수 n에 대해
    // k개의 아이템을 뽑는 이항계수(조합의 수)
    // nCk 가 되는데
    // n! / (n-k)! k! 이다. (단 0<= k <=n) 이다.
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int nk = n - k;

        System.out.println(factorial(n) / (factorial(nk) * factorial(k)));
        System.out.println(pascal(n, k));

        /* 리팩토링
        int fac_n = 1;
        int fac_k = 1;
        int fac_nk = 1;
        while (n > 1) {
            fac_n *= n;
            n--;
        }

        while (k > 1) {
            fac_k *= k;
            k--;
        }

        while (nk > 1) {
            fac_nk *= nk;
            nk--;
        }*/
    }

    public static int pascal(int n, int k) {
        // 성질2
        if (n == k || k == 0) {
            return 1;
        }

        // 파스칼의 법칙, 성질 1
        return pascal(n - 1, k - 1) + pascal(n - 1, k);
    }

    public static int factorial(int num) {
        int fac = 1;
        for (int i = num; i > 1; i--) {
            fac *= i;
        }
        return fac;
    }
}
