package Algoritm.day6;

import java.io.*;
import java.util.StringTokenizer;

public class no8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());    // 총 참여 국가 수
        int K = Integer.parseInt(st.nextToken());    // 알고 싶은 국가 넘버

        int[][] result = new int[N - 1][3];      // 국가의 메달 결과를 담은 NX4 행렬 만들기
        int temp = 0;
        int[] target = new int[3];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str); // 1 1 2 0

            if (Integer.parseInt(st.nextToken()) == K) {
                for (int j = 0; j < 3; j++) {
                    target[j] = Integer.parseInt(st.nextToken());
                }
            } else {
                for (int j = 0; j < 3; j++) {
                    int medal_result = Integer.parseInt(st.nextToken());
                    result[temp][j] = medal_result;
                }
                temp++;
            }
        }

        int ranking = 1;    // 비교하고자 하는 나라의 순위를 저장할 변수
        // 금메달 개수 비교

        for (int i = 0; i < N - 1; i++) {
            if (result[i][0] > target[0]) {
                ranking++;
            } else if (result[i][0] == target[0] && result[i][1] > target[1]) {
                ranking++;
            } else if (result[i][0] == target[0] && result[i][1] == target[1] && result[i][2] > target[2]) {
                ranking++;
            }
        }
        System.out.println(ranking);
    }
}
