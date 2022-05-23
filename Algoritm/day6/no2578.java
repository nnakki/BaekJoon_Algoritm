package Algoritm.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
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
            StringTokenizer mcStrs = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                String mcStr = mcStrs.nextToken();
                for (int x = 0; x < 5; x++) {
                    for (int y = 0; y < 5; y++) {
                        if (chulsu[x][y].equals(mcStr)) {
                            saveOrder[x][y] = cnt;
                            cnt++;
                        }
                    }
                }
            }
        }
        //빙고가 만들어지는 경우의 수들을 저장할 리스트 생성
        ArrayList<Integer> orderList = new ArrayList<>();

        //빙고가 되는 경우의 수 (가로줄의 최대값)
        for (int i = 0; i < 5; i++) {
            int line_max = 0;
            for (int j = 0; j < 5; j++) {
                if (saveOrder[i][j] > line_max) {
                    line_max = saveOrder[i][j];
                }
            }
            orderList.add(line_max);
        }

        //새로줄 최대값
        for (int i = 0; i < 5; i++) {
            int line_max = 0;
            for (int j = 0; j < 5; j++) {
                if (saveOrder[j][i] > line_max) {
                    line_max = saveOrder[j][i];
                }
            }
            orderList.add(line_max);
        }

        //대각선 왼->아 최대값
        int line_max = 0;
        for (int i = 0; i < 5; i++) {
            if (saveOrder[i][i] > line_max) {
                line_max = saveOrder[i][i];
            }
        }
        orderList.add(line_max);

        int line_max2 = 0;
        for (int i = 0; i < 5; i++) {
            if (saveOrder[i][4 - i] > line_max2) {
                line_max2 = saveOrder[i][4 - i];
            }
        }
        orderList.add(line_max2);

        Collections.sort(orderList);
        int answer = orderList.get(2);

        System.out.println(answer);
    }
}