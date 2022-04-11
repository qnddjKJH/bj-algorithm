package questions;

/**
 *  셀프 넘버
 * d(n) = n + (n의 각 자릿수의 합)
 * d(1) = 2 -> 1이 2의 생성자다
 * 생성자가 없는 수를 셀프 넘버라고 한다.
 * 
 * 입력값은 없다
 * 출력값은
 * 10000 보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력
 * 
 * 브루트 포스 문제이었다
 * 하지만 DP 로 풀었다 'ㅁ'....
 */
public class SelfNumber {
    public static final int MAX = 10001;
    public static int arr[];

    public void doSelfNumber() {
        arr = new int[MAX];

        
        for(int i=0; i < 10001; i++) {
            arr[i] = 0;
        }
        
        
        for(int i=1; i < 10001; i++) {
            int n = i;
            int result = i;
            while(n != 0) {
                result += (n % 10);
                n = n / 10;
            }
            
            if(result <= 10000) {
                arr[result] += 1;
            }
            
            if(arr[i] == 0) {
                System.out.println(i);
            }
        }
        // for(int i=0; i < MAX; i++) {
        //     arr[i] = 0;
        // }
        
        // for(int i=1; i <= MAX; i++) {
        //     int result = valid(i);
        //     if(result < MAX) {
        //         arr[result] += 1;
        //     }
        // }
    
        // for(int i = 1; i <= MAX; i++) {
        //     if(arr[i] == 0) {
        //         System.out.println(i);
        //     }
        // }
    }
    
    // private int valid(int n) {
    //     int result = n;
    //     while(n != 0) {
    //         result += (n % 10);
    //         n = n/10;
    //     }
    //     return result;
    // }

}
