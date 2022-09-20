package src.baekjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 나중에 다시 생각하자
// 체스판 다시 칠하기
public class BJ1018 {
    public static int solved(int start_row, int start_col, String[] board) {
        String[] origin = {"WBWBWBWB", "BWBWBWBW"};
        int white = 0;
        
        for (int i = 0; i < 8; i++) {
            int row = start_row + i;    // 열
            for (int j = 0; j < 8; j++) {
                int col = start_col + j;    // 행
                if (board[row].charAt(col) != origin[row % 2].charAt(j)) {
                    white++;
                }
            }
        }
        return Math.min(white, 64 - white);
    }

    public static void main(String[] args) throws IOException {
        // 입력 N과 M (8 <= N, M <= 50)
        // N 개의 줄
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] board = new String[N];

        // 체스판 줄 초기화
        for (int i = 0; i < board.length; i++) {
            board[i] = br.readLine();
        }

        int solution = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                
                // 체스판 잘라서 계산 시작 (시작 지점으로 부터 8칸 비교)
                int currentSolution = solved(i, j, board);

                if (solution > currentSolution) {
                    solution = currentSolution;
                }
            }
        }

        System.out.println(solution);
    }
}
