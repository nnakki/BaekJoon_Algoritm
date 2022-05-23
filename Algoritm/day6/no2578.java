package Algoritm.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no2578 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] chulsu = new String[5][5];
        int[][] saveOrder = new int[5][5];

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                String str = st.nextToken();
                chulsu[i][j] = str;
            }
        }

        int cnt = 1;

        //빙고값을 부른대로 저장되는 새로운 5x5 행렬 생성
        for (int i = 0; i < 5; i++) {
            StringTokenizer mcStr = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                if (chulsu[i][j].equals(mcStr)) {
                    saveOrder[i][j] = cnt;
                }
            }
        }

        //빙고가 되는 경우의 수 (가로줄의 최대값)
        int answer = 25;
        for (int i = 0; i < 5; i++) {
            int line_max = 0;
            for (int j = 0; j < 5; j++) {
                if (saveOrder[i][j] > line_max) {
                    line_max = saveOrder[i][j];
                }
            }
            answer = Math.min(answer, line_max);
        }

        //새로줄 최대값
        for (int i = 0; i < 5; i++) {
            int line_max = 0;
            for (int j = 0; j < 5; j++) {
                if (saveOrder[j][i] > line_max) {
                    line_max = saveOrder[j][i];
                }
            }
            answer = Math.min(answer, line_max);
        }

        //대각선
    }
}