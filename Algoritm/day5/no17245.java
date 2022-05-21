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
        int all_count = 0;
        int max_computer = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                serverRoom[i][j] = Integer.parseInt(st.nextToken());
                all_count += serverRoom[i][j];
                if (max_computer < serverRoom[i][j]) {
                    max_computer = serverRoom[i][j];
                }
            }
        }

        //켜져야하는 컴퓨터의 대수
        int targetNum = (int) Math.ceil((double) all_count / 2);

        max_computer++;
        int min_computer = 0;
        int middle_computer;
        int level = 0;

        while (min_computer < max_computer) {
            middle_computer = (min_computer + max_computer) / 2;
            System.out.println(middle_computer);
            int cnt = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (serverRoom[i][j] >= middle_computer) {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
            if (cnt < targetNum) {
                max_computer = middle_computer;
            } else {
                level = middle_computer;
                min_computer = middle_computer + 1;
            }
        }
        System.out.println(level);
    }
}
