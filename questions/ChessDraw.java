package questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChessDraw {
    /**
     * 
     * 
     * Input : 
     * first - N, M (50 >= M, N >= 8)
     * second - N 개의 줄 보드의 각 행
     * B = Black, W = White
     */
    
    public static boolean[][] arr;
    public static int min = 64; 
    public void doChess() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        // 입력 받은 색깔 체스판 그리기
        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            for(int j = 0; j < M; j++) {
                if(str.charAt(j) == 'W') {
                    arr[i][j] = true; // 흰색 True
                } else {
                    arr[i][j] = false; // 검은색 False
                }
            }
        }

        int N_row = N-7;
        int M_row = M-7;

        for(int i = 0; i < N_row; i++) {
            for(int j = 0; j < M_row; j++) {
                find(i, j);
            }
        }

        System.out.println(min);
    }

    private void find(int x, int y) {

        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        boolean TF = arr[x][y];

        System.out.println();
        System.out.println("찾는 체스판");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println();
        
        for(int i = 0; i < end_x; i++) {
            for(int j = 0; j < end_y; j++) {
                if(arr[i][j] != TF) {
                    count++;
                }
                TF = (!TF);
                System.out.print(arr[i][j] + " ");
            }
            TF = !TF;
            System.out.println();
        }

        count = Math.min(count, 64-count);
        min = Math.min(min, count);
    }
}
