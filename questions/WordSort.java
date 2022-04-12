package questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 알파벳 소문자로 N개의 단어가 들어온다
 * 1. 길이가 짧은 것부터
 * 2. 길이가 같으면 사전 순으로
 * 
 * 입력
 * N = 단어 개수 (1 <= N <= 20000)
 * N 개의 줄만큼 단어 입력
 * 문자열의 길이는 50을 넘지 않음
 * 
 * --- 지금 생각해 낸거 ---
 * - 길이 1차 분류
 * - 사전 2차 분류
 * 
 */
    // Comparator 의 compare
    // 리턴값 -1, 0, 1
    // -1 : 두 요소의 위치를 바꿈
    // 0 : 두 요소가 같음을 의미 (바뀌는 거 없음)
    // 1 : 두 요소의 위치를 그대로 둠
    // 리턴값 전체에 * -1 을 하면 역순으로 정렬 가능

    // 정리
    // Comparble - 정렬이 필요한 클래스 내부에서 compareTo 메소드 구현
    // Compartor - 정렬 기준만을 가진 객체를 생성 기준으로 비교해준다.
    // 둘 모두 - Arrays.sort 또는 Collections.sort 에서 사용 
        
public class WordSort {
    
    public void answer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];
        
        for(int i = 0; i < n; i++) {
            String word = br.readLine();
            arr[i] = word;
        }

        Arrays.sort(arr, (s1, s2) -> {
            if(s1.length() == s2.length()) {
                return s1.compareTo(s2);
            } else {
                return s1.length() - s2.length();
            }
        });

        StringBuilder sb = new StringBuilder();

        sb.append(arr[0] + "\n");
        for(int i = 1; i<arr.length; i++) {
            if(!arr[i-1].equals(arr[i])) {
                sb.append(arr[i]+"\n");
            }
        }
        System.out.println(sb);

        // for(int i=1; i < arr.length; i++) {
        //     if(i == 1) {
        //         System.out.println(arr[0]);
        //     }
        //     if(!arr[i-1].equals(arr[i])) {
        //         System.out.println(arr[i]);
        //     }
        // }
    }
}
