package Algoritm.day6;

import java.io.*;
import java.util.StringTokenizer;

public class no8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());    // 총 참여 국가 수
        int K = Integer.parseInt(st.nextToken());    // 알고 싶은 국가 넘버

        int[][] olympicReuslt = new int[N][4];      // 국가의 메달 결과를 담은 NX4 행렬 만들기

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);
            for (int j = 0; j < 4; j++) {
                int result = Integer.parseInt(st.nextToken());
                olympicReuslt[i][j] = result;
            }
        }

        // 금메달 개수 비교
    }

}
