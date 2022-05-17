package Algoritm;

import java.util.Scanner;

//부녀회장이 될테야
public class no2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int[][] apart = new int[15][15];

        for (int i = 0; i < 15; i++) {
            apart[i][1] = 1;
            apart[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                apart[i][j] = apart[i - 1][j] + apart[i][j - 1];
            }
        }

        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sb.append(apart[n][k] + "\n");
        }
        System.out.println(sb);
    }
}
