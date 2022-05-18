package Algoritm;

import java.io.*;
import java.util.StringTokenizer;

//체스판 다시 칠하기
public class no1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int minChange;
        int result = 33;

        char[][] chess = new char[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                chess[i][j] = str.charAt(j);
            }
        }

        for (int n = 0; n < N - 7; n++) {
            for (int m = 0; m < M - 7; m++) {
                minChange = findMinChange(n, m, chess);
                if (result >= minChange) {
                    result = minChange;
                }
            }
        }
        System.out.println(result);
    }

    public static int findMinChange(int n, int m, char[][] chess) {

        int changeCount = 0;
        int max_row = n + 8;
        int max_col = m + 8;

        for (int i = n; i < max_row; i++) {
            for (int j = m; j < max_col; j++) {

                int remain = (n + m) % 2;

                if (chess[n][m] == 'W') {
                    if ((i + j) % 2 == remain && chess[i][j] != 'W') {
                        changeCount++;
                    } else if ((i + j) % 2 != remain && chess[i][j] != 'B') {
                        changeCount++;
                    }
                } else {
                    if ((i + j) % 2 == remain && chess[i][j] != 'B') {
                        changeCount++;
                    } else if ((i + j) % 2 != remain && chess[i][j] != 'W') {
                        changeCount++;
                    }
                }
            }
        }
        return changeCount;
    }
}
