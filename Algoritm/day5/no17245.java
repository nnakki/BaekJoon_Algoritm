package Algoritm.day5;


import java.io.*;
import java.util.StringTokenizer;

//서버실
public class no17245 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] serverRoom = new int[N][N];
        long all_count = 0;
        int max = 0;
        int min = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                serverRoom[i][j] = Integer.parseInt(st.nextToken());
                all_count += serverRoom[i][j];
                if (max < serverRoom[i][j]) {
                    max = serverRoom[i][j];
                }
            }
        }

        //켜져야하는 컴퓨터의 대수
        //int targetNum = (int) Math.ceil((double) all_count / 2);

        int mid = 0;
        while (min + 1 < max) {
            mid = (min + max) / 2;
            long cnt = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (serverRoom[i][j] > mid) {
                        cnt += mid;
                    } else {
                        cnt += serverRoom[i][j];
                    }
                }
            }

            if (((double) cnt / all_count) >= 0.5) {
                max = mid;
            } else {
                min = mid;
            }
        }
        System.out.println(max);
    }
}
